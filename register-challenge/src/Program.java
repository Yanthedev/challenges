import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String name;
        String lastName ;
        int age;
        double height;

        while (true) {
            try {
                System.out.println("Digite seu nome");
                name = scanner.nextLine().trim();

                if (name.isEmpty()) {
                    throw new IllegalArgumentException("O nome não pode estar vazio.");
                }

                System.out.println("Digite seu sobrenome");
                lastName = scanner.nextLine().trim();

                if (lastName.isEmpty()) {
                    throw new IllegalArgumentException("O sobrenome não pode estar vazio.");
                }

                System.out.println("Digite sua idade");
                age = Integer.parseInt(scanner.nextLine());

                if (age <= 0) {
                    throw new IllegalArgumentException("Idade inválida.");
                }

                System.out.println("Digite sua altura");
                height = Double.parseDouble(scanner.nextLine().replace(",","."));

                if (height <= 0) {
                    throw new IllegalArgumentException("Altura inválida.");
                }

                break;

            } catch (NumberFormatException e) {
                System.err.println("Erro: valor numérico inválido.");
                System.out.println("Tente novamente.\n");

            } catch (IllegalArgumentException e) {
                System.err.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente.\n");
            }
        }

        System.out.println("\n=== DADOS ===");
        System.out.println("Nome completo: " + name + " " + lastName);
        System.out.println("Idade: " + age);
        System.out.println("Altura: " + height);

        scanner.close();
    }
}
