import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Academia academia = new Academia();// Alimentamos aula e professor
		boolean inicio = false;

		while (!inicio) {
			System.out.println("\n----- AULAS -----");
			System.out.println("Deseja visualizar a disponibilidade de aulas?");
			System.out.println("1 - Sim");
			System.out.println("2 - Sair");
			System.out.print("Opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
				case 1:
					System.out.println("Digite o seu nome: ");
					String nomeAluno = scanner.nextLine();
					System.out.println("\n----- AULAS DISPONÍVEIS -----");
					List<Aula> aulasDisponiveis = academia.listarAulasDisponiveis();

					if (aulasDisponiveis.isEmpty()) {
						System.out.println("Não temos aulas no nomento, entre em contato com a coordenação.");
					} else {
						for (Aula aula : aulasDisponiveis) {
							System.out.printf("A aula disponível: %s..: ID: %d\n", aula.getNomeAula(), aula.getId());
						}
					}
					// Implementar a lógica de selecionar a aula com base no seu ID.
					System.out.println("Selecione sua aula pelo ID: ");
					BigInteger idEscolhido = scanner.nextBigInteger();

					Aula aulaEscolhida = academia.buscarAulaId(idEscolhido);
					if (aulaEscolhida != null) {
						boolean sucesso = academia.matricularAluno(aulaEscolhida, nomeAluno);

						if (sucesso) {
							System.out.println("\nMatrícula realizada com sucesso!");
							System.out.println("Aluno: " + nomeAluno);
							System.out.println("Aula: " + aulaEscolhida.getNomeAula());
							System.out.println("Vagas restantes na aula: " + aulaEscolhida.getVagasDisponiveis());
						} else {
							System.out.println("\nNão foi possível realizar a matrícula: não há mais vagas disponíveis nesta aula.");
						}
					} else {
						System.out.println("\nAula não encontrada com o ID fornecido.");
					}

					inicio = true;
					break;

				case 2:
					System.out.println("Sistema encerrado...");
					inicio = true;
					break;

			}
		}
	}
}