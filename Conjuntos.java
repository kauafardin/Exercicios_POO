import java.util.Scanner;
import java.util.ArrayList;
public class Conjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<>();
        ArrayList<Integer> w = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        System.out.println("Lista V:Digite 10 numeros distintos ou (um negativo para parar): ");
        while (v.size() < 10) {
            int numero = scanner.nextInt();
        
            if (numero < 0) {
                break;
            }
          
            if (!v.contains(numero)) {
                v.add(numero);
            } else {
                System.out.println("Número já inserido. Digite um número distinto.");
            }
        }
        System.out.println("Lista W:Digite 10 numeros distintos ou (um negativo para parar): ");
        while (w.size() < 10) {
            int numero = scanner.nextInt();
        
            if (numero < 0) {
                break;
            }
            if (!w.contains(numero)) {
                w.add(numero);
            } else {
                System.out.println("Número já inserido. Digite um número distinto.");
            }
        }
        int opcao;

        do {
            // Exibe o menu
            System.out.println("\nMenu:");
            System.out.println("1. União de conjuntos");
            System.out.println("2. Intersecção de conjuntos");
            System.out.println("3. Subtração de conjuntos (V-W)");
            System.out.println("4. Subtração de conjuntos (W-V)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Lê a opção escolhida
            opcao = scanner.nextInt();
            
            // Executa ação com base na opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção 1");
                    for (int numero_v : v){
                        if (!r.contains(numero_v)) {
                            r.add(numero_v);
                        }
                    }
                    for (int numero_w : w){
                        if (!r.contains(numero_w)) {
                            r.add(numero_w);
                        }
                    }
                    System.out.println(r);
                    break;
                    
                case 2:
                    System.out.println("Você escolheu a Opção 2");
                    for (int numero_v : v){
                        if (w.contains(numero_v)){
                            r.add(numero_v);
                        }
                    }
                    System.out.println(r);
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3");
                    for (int numero_v : v){
                        if (!w.contains(numero_v)){
                            r.add(numero_v);
                        }
                    }
                    System.out.println(r);
                    break;
                case 4:
                    System.out.println("Você escolheu a Opção 4");
                    for (int numero_w : w){
                        if (!v.contains(numero_w)){
                            r.add(numero_w);
                        }
                    }
                    System.out.println(r);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
        } while (opcao != 5); 
        scanner.close();

    }
}
//Fazer um algoritmo que leia números inteiros, armazenando os números distintos em um vetor V, até que
//seja informado um número negativo ou sejam armazenados dez números distintos. Após o algoritmo deve fazer
//o mesmo para armazenar números distintos em um vetor W, e então, ler uma opção e caso essa for:
//1 - Efetuar a operação de união de conjuntos, armazenando o resultado no vetor R.
//2 - Efetuar a operação de intersecção de conjuntos, armazenando o resultado no vetor R.
//3 - Efetuar a operação de subtração de conjuntos (V-W), armazenando o resultado no vetor R.
//4 - Efetuar o operação de subtração de conjuntos (W-V), armazenando o resultado no vetor R.
//Finalmente, escreva o resultado da operação selecionada acima, ou seja, os números que estão no vetor R.