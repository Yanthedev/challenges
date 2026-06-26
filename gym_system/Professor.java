import java.math.BigInteger;

public class Professor {
	private BigInteger id;
	private String nome;
	private String especialidade;

	public Professor(BigInteger id, String nome, String especialidade) {
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public BigInteger getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}
}