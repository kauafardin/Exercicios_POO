import java.util.Scanner;
public class Lista1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor do lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor do lado c: ");
        double c = scanner.nextDouble();

        double semi_p = (a + b + c)/2;
        double area = Math.sqrt(semi_p * (semi_p - a) * (semi_p - b) * (semi_p - c));
        System.out.println("Área do Trinângulo: " + area);
        scanner.close();
    }
}
//Fazer um algoritmo que leia as dimensões dos lados de um triângulo (a,b,c), calculando e escrevendo a área
//do mesmo.

//Área=ss−as−bs−c  onde s é o semi-perímetro: s=
//abc/2