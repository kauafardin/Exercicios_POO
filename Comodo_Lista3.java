public class Comodo_Lista3 {
    private String tipo;
    private double tamanho;

    public Comodo_Lista3(String tipo, double tamanho){
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public void exibir(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamanho: " + tamanho + " m²");
    }
}

//Crie uma classe Comodo com atributos como tipo (quarto, sala, banheiro) e tamanho. 
//Em seguida, crie uma classe Casa que tenha uma lista de cômodos. 
//Cada cômodo deve ser parte da casa e ser destruído quando a casa for destruída.
