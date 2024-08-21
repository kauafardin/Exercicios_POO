public class Estatisticas {
    public static void main(String[] args) {
        int[] numeros = {10,-20,30,-40,50,-60,70,-80,90,100};

        int soma = 0;
        int multiplicacao = 1;
        int maior = 0;
        int menor = Integer.MAX_VALUE;
        int cont = 0;
        for (int numero : numeros){
            soma = soma + numero;
            multiplicacao = multiplicacao * numero;
            cont++;
        
        if (numero > maior){
            maior = numero;
        }
        if (numero < menor){
            menor = numero;
        }
        }
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        double media_arit = soma / cont;
        System.out.println("Média: " + media_arit);
    }
}

//Fazer um algoritmo que leia quarenta números inteiros positivos e/ou negativos e escreva: a soma desses
//números; a multiplicação dos mesmos; o maior; o menor e finalmente a média aritmética dos números lidos.
