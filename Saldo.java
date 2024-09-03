import java.util.Scanner;
public class Saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um saldo inicial positivo: ");
        double saldo = scanner.nextDouble();
        if (saldo < 200){
            System.out.printf("Saldo insuficiente: R$ %.2f%n", saldo);
            scanner.close();
            return;
        }
        int meses = 0;
        while (saldo >= 200) {
            saldo += (saldo * 5)/100;
            saldo = saldo - 200;
            meses++;
        }
        saldo += (saldo * 5)/100;
        System.out.printf("O saldo será insuficiente em: %d meses com saldo de: R$ %.2f%n",meses,saldo);
        scanner.close();
    }
}


//Sabe-se que uma aplicação financeira paga 5% de juros ao mês, e o aplicador retira (saca) mensalmente
//200,00. Fazer um algoritmo que leia o valor inicial aplicado e calcule em quantos meses o saldo será
//insuficiente para sacar 200,00 e qual este saldo. Ex: lê saldo inicial: 800,00; escreve: 5 meses, saldo=115,89