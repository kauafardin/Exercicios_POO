public class MAIN_Lista3_EX10 {
    public static void main(String[] args) {
        Cliente_Lista3 cliente1 = new Cliente_Lista3(1);
        Cliente_Lista3 cliente2 = new Cliente_Lista3(2);

        Pedido_Lista3 pedido1 = new Pedido_Lista3("Celular", 1);
        Pedido_Lista3 pedido2 = new Pedido_Lista3("Tênis", 2);
        Pedido_Lista3 pedido3 = new Pedido_Lista3("Fone de ouvido", 1);

        cliente1.adicionar(pedido1);
        cliente2.adicionar(pedido2);
        cliente1.adicionar(pedido3);

        cliente1.listar();
        cliente2.listar();
    }
}
