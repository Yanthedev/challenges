import java.math.BigInteger;
import java.time.LocalDate;

public class Matricula {
	private BigInteger id;
	private Aula aula; // Afinal, o nome da aula esta contido em aula
	private String nomeAluno;
	private LocalDate dataMatricula;
	private boolean ativa;

	public Matricula(BigInteger id, Aula aula, String nomeAluno, LocalDate dataMatricula, boolean ativa) {
		this.id = id;
		this.aula = aula;
		this.nomeAluno = nomeAluno;
		this.dataMatricula = dataMatricula;
		this.ativa = ativa;
	}

	public BigInteger getId() {
		return id;
	}

	public Aula getAula() {
		return aula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public boolean getAtiva() {
		return ativa;
	}

	// Não vou ter que ficar atualizando matricula. Só se fosse rematricula
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
}