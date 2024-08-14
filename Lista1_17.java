import java.util.Scanner;
public class Lista1_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro Horário\n");
        System.out.print("Horas (0-23):");
        int hora = scanner.nextInt();

        System.out.print("Minutos (0-59):");
        int minutos = scanner.nextInt();

        System.out.print("Segundos (0-59):");
        int segundos = scanner.nextInt();

        System.out.print("Segundos transcorridos:");
        int segundos_transcorridos = scanner.nextInt();

        int segundos_1 = hora * 3600 + minutos * 60 + segundos;
        int segundo_horario = segundos_1 + segundos_transcorridos;

        int horas = segundo_horario / 3600;
        int minuto = (segundo_horario % 3600) / 60;
        int segundo = segundo_horario % 60;
        System.out.printf("O Segundo Horário é: %02d:%02d:%02d%n", horas, minuto, segundo);
        
        scanner.close();
    }    
}

//Fazer um algoritmo que a partir de um horário (hora,minuto,segundo) e uma quantidade de segundos
//transcorridos, calcule e escreva o segundo horário (considerar que o horário calculado esteja no mesmo dia no
//formato de 24 horas).