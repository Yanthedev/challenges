package rocketseat.library_system;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        carregarAutores();
        carregarLivros();
    }

    private void carregarAutores() {
        Autor autor1 = new Autor(BigInteger.valueOf(1), "George Orwell", LocalDate.of(1903, 6, 25));
        Autor autor2 = new Autor(BigInteger.valueOf(2), "J.K. Rowling", LocalDate.of(1965, 7, 31));
        autores.add(autor1);
        autores.add(autor2);
    }

    private void carregarLivros() {
        Livro livro1 = new Livro(BigInteger.valueOf(1), "1984", autores.get(0), true, LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 1, 1));
        Livro livro2 = new Livro(BigInteger.valueOf(2), "Harry Potter e a Pedra Filosofal", autores.get(1), true,
                LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 1));
        livros.add(livro1);
        livros.add(livro2);
    }

    // Método que lista os livros disponíveis.
    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();

        for (Livro livro : this.livros) {
            if (livro.getDisponivel()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    // Método que seleciona o livro com base no seu id.
    public Livro buscarLivroPorId(BigInteger id) {
        for (Livro livro : this.livros) {
            if (livro.getId().equals(id)) {
                return livro;
            }
        }
        return null;
    }

    // Método que realiza o empréstimo de um livro.
    public void registrarEmprestimo(Livro livro, String nomeCliente) {
        // Gera um ID simples para o empréstimo
        BigInteger novoId = BigInteger.valueOf(this.emprestimos.size() + 1);

        // 2. Instancia o empréstimo
        Emprestimo novoEmprestimo = new Emprestimo(
                novoId,
                livro,
                nomeCliente,
                LocalDate.now(), // Data de hoje
                null // Data de devolução começa nula
        );

        // 3. Adiciona na lista de controle da biblioteca
        this.emprestimos.add(novoEmprestimo);
    }

}