import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero_x = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero_y = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o caractere de operação: ");
        String caractere = scanner.nextLine();

        if (caractere.equals("+")){
            double soma = numero_x + numero_y;
            System.out.println("Soma dos valores: " + soma);
        }else if (caractere.equals("-")){
            double subtracao = numero_x - numero_y;
            System.out.println("Subtração dos valores: " + subtracao);
        }else if (caractere.equals("*")){
            double multiplicacao = numero_x * numero_y;
            System.out.println("Multiplicação dos valores: " + multiplicacao);
        }else if (caractere.equals("/")){
            if (numero_y != 0) {
                double divisao = numero_x / numero_y;
                System.out.println("Divisão dos valores: " + divisao);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        }else {
            System.out.println("Operação inválida.");
        }
        scanner.close();
    }
}
