import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros_aleatorios = new ArrayList<>();

        System.out.println("Digite números inteiros (digite um número negativo para parar):");

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            numeros_aleatorios.add(numero);
        }

        int quantidade_n_F = 0;
        int a = 0;
        int b = 1;
        int cont = 0;
        for (int i = 0; i < 100; i++) {
            int temp = a;
            a = b;
            b = temp + b;
            cont++;
            if (numeros_aleatorios.contains(a)) {
                quantidade_n_F++;
            }
        }

        double percentual = (double) quantidade_n_F / numeros_aleatorios.size() * 100;
        System.out.println("Quantidade de números Fibonacci encontrados: " + quantidade_n_F + cont);
        System.out.println("Número inteiro inserido pelo usuário: " + numeros_aleatorios);
        System.out.println("Percentual de números Fibonacci: " + percentual + "%");

        scanner.close();
    }
}


//Fazer um algoritmo que leia números até que seja informado um negativo (descartá-lo) e escreva o percentual
//de números informados que são da sequência de Fibonacci.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,