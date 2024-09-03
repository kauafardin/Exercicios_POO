public class Main_Pedido {
    public static void main(String[] args) {
        
        Pedido pedido1 = new Pedido(1, "12/09/2024");
        Item_Pedido item1 = new Item_Pedido("Celular", 2, 1500.0);
        Item_Pedido item2 = new Item_Pedido("TV", 1, 2500.0);
        Item_Pedido item3 = new Item_Pedido("Rádio", 1, 200.0);

        pedido1.adicionar(item1);
        pedido1.adicionar(item2);
        pedido1.adicionar(item3);

        pedido1.remover(item3);

        pedido1.exibir_pedido();
    }
}
