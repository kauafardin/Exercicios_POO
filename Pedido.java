import java.util.ArrayList;
import java.util.List;
public class Pedido {
    int numero;
    String data;
    List<Item_Pedido> itens_pedido = new ArrayList<>();
    
    public Pedido(int numero, String data){
        this.numero = numero;
        this.data = data;
    }
    public double calcular_valor_total() {
        double total = 0;
        for (Item_Pedido item : itens_pedido) {
            total += item.calcular_valor();
        }
        return total;
    }
    public void adicionar(Item_Pedido item){
        itens_pedido.add(item);
        System.out.println("Item " + item.produto + " adicionado com sucesso!\n");
    }
    public void remover(Item_Pedido item) {
        if (itens_pedido.remove(item)) {
            System.out.println("Item " + item.produto + " removido com sucesso!\n");
        } else {
            System.out.println("Item não encontrado na lista!");
        }
    }
    public void exibir_pedido() {
        System.out.println("Pedido Número: " + numero);
        System.out.println("Data: " + data);
        System.out.println("Itens do Pedido:");
        for (Item_Pedido item : itens_pedido) {
            System.out.println(item.produto);
        }
        System.out.println("Valor Total: R$" + calcular_valor_total());
    }
}

//Crie uma classe `Pedido` com atributos `numero`, `data`, e uma lista de objetos `ItemPedido`.
//Adicione métodos para calcular o valor total do pedido, adicionar e remover itens do pedido.