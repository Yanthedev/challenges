package rocketseat.library_system;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean respostaValida = false;
        Biblioteca biblioteca = new Biblioteca();

        while (!respostaValida) {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("Deseja visualizar os livros disponíveis?");
            System.out.println("1 - Sim");
            System.out.println("2 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- LIVROS DISPONÍVEIS ---");
                    List<Livro> livrosDisponiveis = biblioteca.listarLivrosDisponiveis();

                    if (livrosDisponiveis.isEmpty()) {
                        System.out.println("Não há livros no momento.");
                    } else {
                        for (Livro livro : livrosDisponiveis) {
                            System.out.println("ID: " + livro.getId() + " - Título: " + livro.getTitulo());
                        }
                        System.out.print("Digite o seu nome para o registro: ");
                        String nomeCliente = scanner.next();
                        System.out.print("Digite o ID do livro que deseja pegar emprestado: ");
                        BigInteger idEscolhido = scanner.nextBigInteger();

                        Livro livroEscolhido = biblioteca.buscarLivroPorId(idEscolhido);

                        if (livroEscolhido != null && livroEscolhido.getDisponivel()) {
                            System.out.println("Livro encontrado: " + livroEscolhido.getTitulo());

                            livroEscolhido.setDisponivel(false);
                            livroEscolhido.setDataAtualizacao(LocalDate.now());

                            // 2. Salva o empréstimo no histórico da biblioteca
                            biblioteca.registrarEmprestimo(livroEscolhido, nomeCliente);

                            System.out.println("Empréstimo realizado com sucesso para " + nomeCliente + "!");
                        } else {
                            System.out.println("Livro indisponível ou não cadastrado.");
                        }

                    }
                    respostaValida = true;
                    break;
                case 2:
                    System.out.println("Encerrando o sistema...");
                    respostaValida = true;

                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
