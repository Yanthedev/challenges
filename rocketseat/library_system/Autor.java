package rocketseat.library_system;

import java.math.BigInteger;
import java.time.LocalDate;

public class Autor {
    private BigInteger id;
    private String nome;
    private LocalDate dataNascimento;

    public Autor(BigInteger id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public BigInteger getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
