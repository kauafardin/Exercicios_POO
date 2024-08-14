import java.util.Scanner;
import java.time.LocalDate;

public class Lista1_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate data_atual = LocalDate.now();

        System.out.print("Digite sua data de nascimento (dd MM aaaa): ");
        int diaNascimento = scanner.nextInt();
        int mesNascimento = scanner.nextInt();
        int anoNascimento = scanner.nextInt();
        int data_nascimento = diaNascimento + mesNascimento * 100 + anoNascimento * 1000;

        int dia = data_atual.getDayOfMonth();
        int mes = data_atual.getMonthValue();
        int ano = data_atual.getYear();
        int data_int = dia + mes * 100 + ano * 1000;

        int idade =  (data_int - data_nascimento)/1000;
        System.out.printf("A idade do usuário é: " + idade);

        scanner.close();
    }
}

//Fazer um algoritmo que leia a data de nascimento de uma pessoa e a data atual (cada data com dia, mês e
//ano), calcule e escreva quantos anos esta pessoa possui. Uma possibilidade para resolver este problema é
//transformar os três valores (dia, mês e ano) de cada data em um valor único, após subtrair estes valores e
//finalmente determinar a quantidade de anos.