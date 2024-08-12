import java.util.Scanner;
public class Lista1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor a: ");
        double valor_a = scanner.nextDouble();
        System.out.print("Valor b: ");
        double valor_b = scanner.nextDouble();
        System.out.print("Valor c: ");
        double valor_c = scanner.nextDouble();

        double maior = Math.max(valor_a, Math.max(valor_b, valor_c));
        //Se valor_a é igual ao maior valor, pesoA será 4; caso contrário, será 3.
        double pesoA = (valor_a == maior) ? 4 : 3;
        double pesoB = (valor_b == maior) ? 4 : 3;
        double pesoC = (valor_c == maior) ? 4 : 3;

        double media = (valor_a * pesoA + valor_b * pesoB + valor_c*pesoC)/(pesoA + pesoB + pesoC);
        System.out.print("A média ponderada é: " + media);
        scanner.close();
    }
}
//Fazer um algoritmo que leia três valores (a,b,c), calcula e escreve a média aritmética ponderada destes
//valores, considerando peso 4 para o maior dos três valores e 3 para os outros dois valores.