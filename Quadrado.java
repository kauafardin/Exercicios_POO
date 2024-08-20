public class Quadrado {
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50,60,70,80,90,100};
        for (int numero : numeros) {
            int quadrado = numero * numero;
            System.out.print("Quadrado de " + numero + " é: " + quadrado + "\n");
        }
    }
}

//Fazer um algoritmo que leia dez números inteiros e para cada número lido escreva o respectivo quadrado.