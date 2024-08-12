import java.util.Scanner;
public class Lista1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota_1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota_2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota_3 = scanner.nextDouble();
        
        double media = (nota_1 + nota_2 + nota_3)/3;
        System.out.print("Média final: " + media);
        scanner.close();
    }
}

//Fazer um algoritmo que leia três notas de um aluno, calcule e escreva a sua média aritmética conforme
//equação.