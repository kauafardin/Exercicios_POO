import java.util.Scanner;
public class Lista1_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor pago: ");
        double paulo  = scanner.nextDouble();
        System.out.print("Digite o valor pago: ");
        double pedro = scanner.nextDouble();
        System.out.print("Digite o valor pago: ");
        double plinio = scanner.nextDouble();

        double media = (paulo + pedro + plinio)/3;

        double diferenca_paulo = paulo - media;
        double diferenca_pedro = pedro - media;
        double diferenca_plinio = plinio - media;

        System.out.printf("Saldo de cada aluno:\n Paulo: R$%.2f\n Pedro: R$%.2f\n Plínio: R$%.2f", diferenca_paulo, diferenca_pedro, diferenca_plinio);

        scanner.close();
    }    
}

//Três estudantes (Paulo,Pedro,Plínio) dividem um apartamento. Cada um deles paga algumas despesas
//durante o mês. Fazer um algoritmo que leia o valor que cada um dos estudantes pagou e escreva qual o
//valor(saldo) que cada um deve pagar (valor negativo) ou receber (valor positivo) de forma que as despesas
//fiquem igualmente divididas.