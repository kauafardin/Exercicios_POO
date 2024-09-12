public class Computador_Lista3 {
    private String modeloPC;
    private Processador_Lista3 processador;
    private Memoria_Lista3 memoria;
    private PlacaMae_Lista3 placaMae;

    public Computador_Lista3(String modeloPC, String processadorModelo, double memoriaCapacidade, String placaMaeModelo) {
        this.modeloPC = modeloPC;
        this.processador = new Processador_Lista3(processadorModelo);
        this.memoria = new Memoria_Lista3(memoriaCapacidade);
        this.placaMae = new PlacaMae_Lista3(placaMaeModelo);
    }

    public void exibir() {
        System.out.println("\nSobre o PC: " + modeloPC);
        processador.exibir();
        memoria.exibir();
        placaMae.exibir();
    }

    public String getModelo() {
        return modeloPC;
    }

    public void setModelo(String modeloPC) {
        this.modeloPC = modeloPC;
    }
}

//Implemente uma classe Computador que tenha componentes como Processador, Memória e PlacaMãe. 
//Cada componente deve ser uma classe separada, e o Computador deve compor essas classes. 
//Quando o objeto Computador for destruído, os componentes também devem ser destruídos.