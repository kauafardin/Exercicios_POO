import java.util.Scanner;
public class Lista1_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas unidades: ");
        int q_produto = scanner.nextInt();
        System.out.print("Valor unitário: ");
        double valor_u = scanner.nextDouble();
        
        double valor_total = ((q_produto/3) * 2 + (q_produto%3)) * valor_u;
        System.out.printf("Valor total a pagar é: R$ %.2f%n", valor_total);

        scanner.close();
    }
}

//Uma loja está com um produto em promoção. Para cada três produtos destes adquiridos o cliente paga
//somente dois. Fazer um algoritmo que leia a quantidade comprada deste produto, o valor unitário, calcule e
//escreva o total a ser pago. Exemplos:
