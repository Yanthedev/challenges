import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import java.time.LocalDate;

public class Academia {

	// Aqui eu não apenas criei as listas, mas eu também já as inicializei.
	private List<Aula> aulas = new ArrayList<>();
	private List<Professor> professores = new ArrayList<>();
	private List<Matricula> matriculas = new ArrayList<>();

	public Academia() {
		carregarProfessores();
		carregarAulas();
	}
	// 1. Temos que criar uma seed para professores e aulas.

	private void carregarProfessores() {
		Professor professor1 = new Professor(BigInteger.valueOf(1), "Thaynner", "Software Architect");
		Professor professor2 = new Professor(BigInteger.valueOf(2), "Yan", "Backend Developer");
		professores.add(professor1);
		professores.add(professor2);
	}

	private void carregarAulas() {
		Aula aula1 = new Aula(BigInteger.valueOf(1), "Arquitetura ágil", professores.get(0), 10);
		Aula aula2 = new Aula(BigInteger.valueOf(2), "Desvendando o Java", professores.get(1), 10);
		aulas.add(aula1);
		aulas.add(aula2);
	}

	// Método que lista as aulas diponiveis
	public List<Aula> listarAulasDisponiveis() {
		List<Aula> disponiveis = new ArrayList<>();

		for (Aula aula : this.aulas) {
			if (aula.getVagasDisponiveis() != 0) {
				disponiveis.add(aula);
			}
		}
		return disponiveis;
	}

	// Método para buscar a aula pelo Id.
	public Aula buscarAulaId(BigInteger id) {
		for (Aula aula : this.aulas) {
			if (aula.getId().equals(id)) {
				return aula;
			}
		}
		return null;
	}

	// Método para criar a matrícula.
	public boolean matricularAluno(Aula aula, String nomeAluno) {
		// temos vagas?
		if (aula.getVagasDisponiveis() <= 0) {
			return false;
		}
		BigInteger novoId = BigInteger.valueOf(matriculas.size() + 1); // Criei o valor para ser usado como ID.
		Matricula novaMatricula = new Matricula(novoId, aula, nomeAluno, LocalDate.now(), true);
		matriculas.add(novaMatricula); // Devidamente adicionada o objeto na lista, como id e tudo.
		aula.setVagasDisponiveis(aula.getVagasDisponiveis() - 1);// Temos 10 aulas e eu subtrai 1, que é da minha matrícula.
		aula.setDataAtualizacao();// Coloquei a data de hoje, afinal na data de hoje mais um aluno entrou.
		return true;
	}

}