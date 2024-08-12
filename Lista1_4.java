//Fazer um algoritmo que leia o valor de dois lados de um triângulo e o ângulo entre estes lados em graus
//(a,b,α), calcule e escreva a área deste triângulo.
//Área=
//a.b.sen α
//2
//lembre-se de converter o ângulo de graus para radianos (Π radianos correspondem a 180°).
import java.util.Scanner;
public class Lista1_4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do lado 1:");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o valor do lado 2:");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o valor do Ângulo(entre 0° - 180°):");
        double angulo = scanner.nextDouble();
        
        double anguloRad = Math.toRadians(angulo);
        double area = (lado1 * lado2 * Math.sin(anguloRad))/2;
        System.out.println("Área do Triângulo: " + area);
        scanner.close();
    }
}
