import java.util.ArrayList;

public class Numero_piramidal { 
    public static void main(String[] args) {
        ArrayList<Integer> numeros_primos = new ArrayList<>();
        ArrayList<Integer> numeros_piramidais = new ArrayList<>();
        int contador = 0; 
        int x = 2; 
        
        // Encontrar os primeiros 100 números primos
        while (contador < 200) {
            int cont = 0;
           
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {  
                numeros_primos.add(x);
                contador++; 
            }
            x++;
        }
        // Calcular os números piramidais

        
        for (int i = 2; i < numeros_primos.size(); i++) {
            int piramidal = numeros_primos.get(i - 2) + numeros_primos.get(i - 1) + numeros_primos.get(i);
            numeros_piramidais.add(piramidal);
            if (numeros_piramidais.size() == 100){
                System.out.println("Números piramidais: " + numeros_piramidais + "\n");
            }
        }
        
    }
}

//Um número é dito piramidal quando ele é o resultado da soma de três números primos consecutivos. Fazer
//um algoritmo que calcule e escreva os cem primeiros números piramidais. Exs: 10 = 2+3+5 ; 15 = 3+5+7.
