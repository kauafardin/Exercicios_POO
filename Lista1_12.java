// Uma pessoa aplicou um valor em um determinado banco. Fazer um algoritmo que leia o valor inicial
//aplicado, o percentual de juros pago pelo banco (fixo para todos os meses) e a quantidade de meses que a
//pessoa deixou este valor aplicado, após calcule e escreva o saldo final desta aplicação.
import java.util.Scanner;
public class Lista1_12 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor inicial: ");
        double saldo_i = scanner.nextDouble();
        System.out.print("Percentual de juros: ");
        double p_juros = scanner.nextDouble();
        System.out.print("Quantos meses: ");
        int n_meses = scanner.nextInt();

        double saldo_f = saldo_i* Math.pow((1 + p_juros/100),n_meses);
        System.out.printf("O saldo final do usuário é de: R$ %.2f%n", saldo_f);
        scanner.close();
    }
}
