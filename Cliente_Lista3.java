import java.util.ArrayList;
import java.util.List;

public class Cliente_Lista3 {
    private int id;
    private List<Pedido_Lista3> pedidos;

    public Cliente_Lista3(int id){
        this.id = id;
        this.pedidos = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void adicionar(Pedido_Lista3 pedido){
        if (pedido != null){
            pedidos.add(pedido);
            System.out.println("Produto " + pedido.getProduto() + " adicionado!");
        } else{
            System.out.println("Produto inválido!");
        }
    }

    public void listar(){
        System.out.println("Pedidos: ");
        for (Pedido_Lista3 pedido : pedidos){
            System.out.println("Id Cliente: " + id);
            pedido.exibir();
        }
    }
}
