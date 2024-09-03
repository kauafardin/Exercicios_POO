public class Aluno {
    String nome = "";
    double media = 0;
    double g1 = 0;
    double g2 = 0;

    public void calcular_media(){
        media = (g1 + g2)/2;
    }

    public void exibir(){
        if (media >= 7){
            System.out.println("Nome: " + nome + "\nMédia:" + media);
        }
    }
}
