package rocketseat.library_system;

import java.util.ArrayList;
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
                            System.out.println("ID: " + livro.getId() + " - Título: " + livro.getTitulo() + " - Autor: "
                                    + livro.getAutor().getNome());
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
