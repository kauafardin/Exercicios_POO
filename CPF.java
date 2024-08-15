import java.util.Scanner;
public class CPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Digite os 9 primeiros digitos do CPF (com espaços): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        int i = scanner.nextInt();
        int j;
        int k;
        int soma_j  = 10*a + 9*b + 8*c + 7*d + 6*e + 5*f + 4*g + 3*h + 2*i;
        int resto_j = soma_j%11;
        if (resto_j == 0 || resto_j == 1){
            j = 0;
        }else{
            j = 11 - resto_j;
        }
        
        int soma_k = 11*a + 10*b + 9*c + 8*d + 7*e + 6*f + 5*g + 4*h + 3*i + 2*j;
        int resto_k = soma_k%11;
        if (resto_k == 0 || resto_k == 1){
            k = 0;
        }else{
            k = 11 - resto_k;
        }
        System.out.println("Verificador 1: " + j);
        System.out.println("Verificador 2: " + k);
        System.out.printf("CPF completo: %d%d%d.%d%d%d.%d%d%d-%d%d", a,b,c,d,e,f,g,h,i,j,k);
        scanner.close();
    }
}

//Fazer um algoritmo que leia o CPF (somente primeiros nove dígitos) e escreva os verificadores (dois últimos).