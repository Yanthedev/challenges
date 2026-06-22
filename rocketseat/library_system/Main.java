package rocketseat.library_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("Deseja visualizar os livros disponíveis?");
            System.out.println("1 - Sim");
            System.out.println("2 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Listando livros... ");

                    break;
                case 2:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }
        }
    }
}
