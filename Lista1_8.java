import java.util.Scanner;
public class Lista1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota_1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota_2 = scanner.nextDouble();

        double media = 1/(1/6 - (1/nota_1 + 1/nota_2));
        System.out.printf("Valor mínimo: %.2f%n", media);

        scanner.close();
    }
}

//Fazer um algoritmo que leia as duas primeiras notas de um aluno e calcule qual o valor mínimo da terceira
//nota para que este aluno seja aprovado considerando média harmônica 6.