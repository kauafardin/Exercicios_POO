import java.util.ArrayList;
import java.util.List;

public class Casa_Lista3 {
    private List<Comodo_Lista3> comodos;

    public Casa_Lista3(){
        this.comodos = new ArrayList<>();
    }

    public void criarComodo(String tipo, double tamanho){
        Comodo_Lista3 comodo = new Comodo_Lista3(tipo, tamanho);
        comodos.add(comodo);
        System.out.println("Comodo " + comodo.getTipo() + " adicionado!");
    }

    public void exibirComodos() {
        if (comodos.isEmpty()) {
            System.out.println("A casa não possui cômodos.");
        } else {
            System.out.println("Comodos: ");
            for (Comodo_Lista3 comodo : comodos) {
                comodo.exibir();
            }
        }
    }

}
