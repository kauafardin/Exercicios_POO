public class Main_Produto{
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz",20,200);
        Produto produto2 = new Produto("Feijão",40,500);
        Produto produto3 = new Produto("Milho",30,300);

        produto1.adicionar(100);
        produto2.adicionar(50);
        produto3.adicionar(200);

        produto1.retirar(200);
        produto2.retirar(150);
        produto3.retirar(50);

        produto1.ajustar_preco(5);
        produto2.ajustar_preco(50);
        produto3.ajustar_preco(20);

        produto1.exibir();
        produto2.exibir();
        produto3.exibir();

    }
}