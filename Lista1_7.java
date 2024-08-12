import java.util.Scanner;

public class Lista1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = 6/((1/n1) + (2/n2) + (3/n3));
        System.out.println("Média ponderada do aluno: " + media);
        scanner.close();
    }
}
// Se colocado uma nota negativa a média poderá ser negativa e um valor alto

//Fazer um algoritmo que leia três notas de um aluno, calcule e escreva a sua média harmônica ponderada
//conforme equação abaixo. Após desenvolver o algoritmo, verificar o que acontece caso um ou mais valores
//lidos forem negativos?

