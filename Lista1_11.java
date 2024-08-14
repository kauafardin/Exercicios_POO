import java.util.Scanner;
public class Lista1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x1:");
        double x1 = scanner.nextDouble();

        System.out.print("Digite a coordenada y1:");
        double y1 = scanner.nextDouble();

        System.out.print("Digite a coordenada x2:");
        double x2 = scanner.nextDouble();

        System.out.print("Digite a coordenada y2:");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("A distância entre os dois pontos é: %.2f%n ", distancia);

        scanner.close();
    }
}

//Fazer um algoritmo que leia as coordenadas de dois pontos no plano cartesiano e após calcule e escreva a
//distância entre eles.