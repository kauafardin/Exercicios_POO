import java.util.Arrays;
import java.util.Scanner;

public class OrdenaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        String numeroStr = scanner.next(); 

        // Converte a String para uma lista de caracteres
        char[] digitos = numeroStr.toCharArray();

        // Ordena a lista
        Arrays.sort(digitos);

        // Converte a lista ordenada de volta para uma String e imprime o resultado
        String numero_ordenado = new String(digitos);
        System.out.println("Dígitos em ordem crescente: " + numero_ordenado);

        scanner.close();
    }
}

//Fazer um algoritmo que leia um número inteiro positivo e escreva os dígitos deste número em ordem
//crescente. Ex: lê: 1982 escreve: 1289 ; lê: 670638 escreve: 036678
