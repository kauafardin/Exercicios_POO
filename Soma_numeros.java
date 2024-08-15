import java.util.Scanner;
public class Soma_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        
        int soma = 0;
        for (int x = 1; x <= numero; x++){
            soma += x;    
        }
        System.out.printf("Soma: " + soma);
        scanner.close();
    }
}
