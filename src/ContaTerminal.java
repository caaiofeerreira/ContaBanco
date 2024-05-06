import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Número: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Titular: ");
        String titular = scanner.nextLine();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ titular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque.");

        scanner.close();
    }
}
