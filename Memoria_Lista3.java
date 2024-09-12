public class Memoria_Lista3 {
    private double capacidade;

    public Memoria_Lista3(double capacidade){
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

public void exibir(){
    System.out.println("Memória: " + capacidade + "GB");
}
    
}
