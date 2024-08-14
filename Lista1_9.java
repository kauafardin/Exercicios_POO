import java.util.Scanner;
public class Lista1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (9.0/5.0)*celcius + 32;
        System.out.printf("Temperatura convertida para Fahrenheit: " + fahrenheit + "\n");

        double kelvin = celcius + 273.15;
        System.out.printf("Temperatura convertida para Kelvin: " + kelvin + "\n");

        double rankine = (9.0/5.0)*fahrenheit + 459.67;
        System.out.printf("Temperatura convertida para Rankine: " + rankine);
        scanner.close();
    }
}

//Fazer um algoritmo que leia uma temperatura em graus celsius e escreva as temperaturas correspondentes
//em graus fahrenheit, kelvin e rankine.