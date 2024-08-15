import java.util.ArrayList;
public class Numeros_perfeitos {
    public static void main(String[] args) {
        ArrayList<Long> numeros = new ArrayList<>();

        long menor = Long.MAX_VALUE;
        int qtd_numeros = 0;
        long numero = 2;
        while (qtd_numeros < 3){
            long soma_divisores = 0;
            
            for (long i = 1; i < numero; i++){
                if (numero % i == 0) {
                    soma_divisores += i;
               }
            }
            if (soma_divisores == numero){
                numeros.add(numero);
                qtd_numeros++;
               
                if (numero < menor){
                menor = numero;
                }   
            }
            numero++;
            
        }
        System.out.println("Números perfeitos: " + numeros + "\n");
        System.out.println("Menor número: " + menor);
    }
}

//Fazer um algoritmo que leia números inteiros até que sejam informados dez números perfeitos e escreva o
//menor número perfeito informado.