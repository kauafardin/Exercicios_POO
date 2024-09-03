public class Item_Pedido {
    String produto;
    int quantidade;
    double valor;

    public Item_Pedido(String produto, int quantidade, double valor){
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public double calcular_valor(){
        return valor * quantidade;
        
    }
}

//A classe `ItemPedido` deve ter atributos `produto` e `quantidade`.
