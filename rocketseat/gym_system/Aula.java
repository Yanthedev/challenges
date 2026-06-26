import java.math.BigInteger;
import java.time.LocalDate;

public class Aula {
	//propriedades:
	private BigInteger id;
	private String nomeAula;
	private Professor professor;
	private int vagasDisponiveis;
	private LocalDate dataCadastro;
	private LocalDate dataAtualizacao;

	public Aula(BigInteger id, String nomeAula, Professor professor, int vagasDisponiveis) {
		this.id = id;
		this.nomeAula = nomeAula;
		this.professor = professor;
		this.vagasDisponiveis = vagasDisponiveis;
		this.dataCadastro = LocalDate.now(); //Quando essa aula foi cadastrada para ser lesionada
		this.dataAtualizacao = LocalDate.now();
	}

	public BigInteger getId() {
		return id;
	}

	public String getNomeAula() {
		return nomeAula;
	}

	public Professor getProfessor() {
		return professor;
	}

	public int getVagasDisponiveis() {
		return vagasDisponiveis;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setVagasDisponiveis(int vagasDisponiveis) {
		this.vagasDisponiveis = vagasDisponiveis;
	}
	
	public void setDataAtualizacao() {
		this.dataAtualizacao = LocalDate.now();
	}
}

// vagasDisponiveis será alterado de acordo com o tempo, então eu tenho que ter
// um setter obrigatoriamente, assim como dataCadastro;
// olhei os importes que eu precisava;
// this. --> indica a propriedade da classe.