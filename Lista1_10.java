import java.util.Scanner;
public class Lista1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.printf("Temperatura convertida para Celcius: %.2f%n", celsius );

        scanner.close();
    }
}
//Fazer um algoritmo que converta uma temperatura qualquer de graus fahrenheit para celsius. A fórmula
//abaixo pode ser aplicada diretamente ou há necessidade de isolar TC ? SÓ INVERTER A FÓRMULA ANTERIOR

