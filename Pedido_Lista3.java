public class Pedido_Lista3 {
    private String produto;
    private int quantidade;

    public Pedido_Lista3(String produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
     public void exibir(){
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
     }
}

//Implemente uma classe Pedido com atributos como produto e quantidade. 
//Depois, crie uma classe Cliente que agregue uma lista de pedidos. 
//A existência de um pedido deve ser independente do cliente. 
//Implemente métodos para adicionar e listar os pedidos de um cliente.