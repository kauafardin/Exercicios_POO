import java.util.Scanner;

public class Lista1_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        double s = (1 + Math.sqrt(5))/2;
        double fib_n = (Math.pow(s,n)/Math.sqrt(5));
        // Arredondar o resultado
        long fibonacci = Math.round(fib_n);
        System.out.println("Fibonacci de: ("+ n +") é: " + fibonacci);

        scanner.close();
    }
}
