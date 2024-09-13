import java.util.ArrayList;
import java.util.List;

public class Computador_Lista3_EX9 {
    private String modelo;
    private List<Periferico_Lista3> perifericos;


    public Computador_Lista3_EX9(String modelo){
        this.modelo = modelo;
        this.perifericos = new ArrayList<>();
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo =modelo;
    }

    public void adicionarPeriferico(String nome, String tipo){
        Periferico_Lista3 periferico = new Periferico_Lista3(nome, tipo);
        
        perifericos.add(periferico);
        System.out.println("Periférico " + periferico.getNome() + " adicionado!");
    }

    public void listar(){
        if (perifericos.isEmpty()){
            System.out.println("Não á periféricos na lista!");
        } else{
            System.out.println("Periféricos: ");
            for (Periferico_Lista3 periferico : perifericos){
                periferico.exibir();
            }
        }
    }
}

