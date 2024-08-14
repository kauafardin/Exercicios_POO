import java.util.Scanner;
public class Lista1_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro Horário\n");
        System.out.print("Horas (0-23):");
        int hora_1 = scanner.nextInt();

        System.out.print("Minutos (0-59):");
        int minutos_1 = scanner.nextInt();

        System.out.print("Segundos (0-59):");
        int segundos_1 = scanner.nextInt();

        System.out.print("Digite o segundo Horário\n");
        System.out.print("Horas (0-23):");
        int hora_2 = scanner.nextInt();

        System.out.print("Minutos (0-59):");
        int minutos_2 = scanner.nextInt();

        System.out.print("Segundos (0-59):");
        int segundos_2 = scanner.nextInt();

        int segundo_1 = hora_1 * 3600 + minutos_1 * 60 + segundos_1;
        int segundo_2 = hora_2 * 3600 + minutos_2 * 60 + segundos_2;

        int tempo = Math.abs(segundo_1 - segundo_2);
        System.out.printf("O tempo transcorrido foi de:" + tempo + " segundos");

        scanner.close();
    }
}

//Fazer um algoritmo que leia dois horários (hora,minuto,segundo), calcule e escreva quantos segundos
//transcorreram entre estes dois horários (considerar que os dois horários estejam no mesmo dia no formato de 24
//horas).