public class Controle {
    int[] matriculas = {1,2,3,4,5,6,7,8,9,10};
    String[] nomes = {"Kauã", "Héric", "Rafaela", "Pedro", "João", "Ana", "Maria", "Lucas", "Isaac", "Juliana"};
    int[] idades = {20,20,19,25,23,18,14,22,24,15};
    double[] alturas = {1.87,1.90,1.58,1.60,1.78,1.69,1.75,1.80,1.88,1.77};

    public void media_idades() {
        double soma = 0;
        for (int idade : idades) {
            soma += idade;
        }
        double media = (double) soma / idades.length;
        System.out.println("A média das idades é: " + media);
    }

    public void mais_jovens() {
        int menor1 = Integer.MAX_VALUE;
        int menor2 = Integer.MAX_VALUE;
        String aluno1 = "", aluno2 = "";
        for (int i = 0; i < idades.length; i++){
            if (idades[i] < menor1){
                menor2 = menor1;
                aluno2 = aluno1;
                menor1 = idades[i];
                aluno1 = nomes[i];
            }else if (idades[i] < menor2){
                menor2 = idades[i];
                aluno2 = nomes[i];
            }
        }
        System.out.println("Os dois mais jovens têm idades: " + aluno1 + " e " + aluno2);
    }
        
    public void percentual_idades() {
        int cont = 0;
        for (int idade : idades) {
            if (idade > 16) {
                cont += 1;
            }
        }
        double percentual = ((double) cont / idades.length) * 100;
        System.out.println("Percentual de alunos acima de 16 anos é de: " + percentual + "%");
    }

    public void altura_superior() {
        double soma_a = 0;
        for (double altura : alturas) {
            soma_a += altura;
        }
        double media_a = soma_a / alturas.length;

        int cont = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16 && alturas[i] > media_a) {
                cont += 1;
            }
        }
        System.out.println("Quantidade de alunos menores de 16 anos com altura superior a média: " + cont);
    }
    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.media_idades();
        controle.mais_jovens();
        controle.percentual_idades();
        controle.altura_superior();
    }
}

