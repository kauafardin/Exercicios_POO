import java.util.Scanner;
import java.time.LocalDate;
public class Lista1_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate data_atual = LocalDate.now();

        System.out.print("Digite sua data de nascimento (dd MM aaaa): ");
        int diaNascimento = scanner.nextInt();
        int mesNascimento = scanner.nextInt();
        int anoNascimento = scanner.nextInt();
        int dias_nascimento = diaNascimento + mesNascimento * 30 + anoNascimento * 365;

        int dia = data_atual.getDayOfMonth();
        int mes = data_atual.getMonthValue();
        int ano = data_atual.getYear();
        int dias_atual = dia + mes * 30 + ano * 365;
        int dias_vividos = dias_atual - dias_nascimento;

        
        System.out.printf("Total de Dias vividos: " + dias_vividos); 

        scanner.close();
    }
}

//Fazer um algoritmo que leia a data de nascimento de uma pessoa e a data atual(cada data com dia, mês e
//ano), calcule e escreva quantos dias (aproximadamente) esta pessoa já viveu. Considere (para facilitar) que
//todos os meses possuem 30 dias e que os anos possuem 365 dias.