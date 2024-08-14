import java.util.Scanner;
public class Lista1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Descobrindo o Maior\n");
        System.out.print("Digite um número: ");
        double numero_a = scanner.nextDouble();

        System.out.print("Digite um número: ");
        double numero_b = scanner.nextDouble();

        System.out.print("Digite um número: ");
        double numero_c = scanner.nextDouble();

        double maiorAB = ((numero_a + numero_b) + Math.abs(numero_a - numero_b))/2;
        double maior = ((maiorAB + numero_c) + Math.abs(maiorAB - numero_c))/2;
        System.out.printf("O número maior é: " +  maior + "\n");

        System.out.print("Descobrindo o Menor\n");
        System.out.print("Digite um número: ");
        double numero_d = scanner.nextDouble();

        System.out.print("Digite um número: ");
        double numero_e = scanner.nextDouble();

        System.out.print("Digite um número: ");
        double numero_f = scanner.nextDouble();

        System.out.print("Digite um número: ");
        double numero_g = scanner.nextDouble();

        double menorDE = ((numero_d + numero_e) - Math.abs(numero_d - numero_e))/2;
        double menorFG = ((numero_f + numero_g) - Math.abs(numero_f - numero_g))/2;
        double menor = ((menorDE + menorFG) - Math.abs(menorDE - menorFG))/2;
        System.out.printf("O número menor é: " +  menor);

        scanner.close();

        
    }
}

//A forma mais comum para determinar o maior de dois números é utilizando comandos de decisão.
//Alternativamente podemos calcular o maior de dois números pela fórmula abaixo.
//a) Fazer um algoritmo que leia três números, calcule e escreva o maior.
//b) Determinar como poderia ser encontrado o menor de dois números de forma similar. Fazer um algoritmo
//para determinar o menor de quatro números.