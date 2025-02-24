package Candidatura;
import java.util.Locale;
import java.util.Scanner;

public class CalculoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Recebe o saldo inicial
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Recebe as três transações
        System.out.print("Digite a primeira transação: ");
        double transacao1 = scanner.nextDouble();
        System.out.print("Digite a segunda transação: ");
        double transacao2 = scanner.nextDouble();
        System.out.print("Digite a terceira transação: ");
        double transacao3 = scanner.nextDouble();

        // Calcula o saldo final
        saldo += transacao1 + transacao2 + transacao3;

        // Exibe o saldo final
        System.out.printf("O saldo final é: %.2f%n", saldo);

        scanner.close();
    }
}