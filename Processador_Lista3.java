public class Processador_Lista3 {
    private String modeloProcessador;

    public Processador_Lista3(String modeloProcessador){
        this.modeloProcessador = modeloProcessador;
    }

    public String getModelo() {
        return modeloProcessador;
    }

    public void setModelo(String modeloProcessador) {
        this.modeloProcessador = modeloProcessador;
    }

    public void exibir(){
        System.out.println("Modelo do Processador: " + modeloProcessador);
    }
}
