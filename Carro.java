public class Carro {
    String marca;
    String modelo;
    int ano;
    double kilometragem;

    public Carro(String marca, String modelo, int ano, double kilometragem){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
    }
    public void alterar_kilometragem_total(double nova_kilometragem){
        if (nova_kilometragem > 0){
            kilometragem = nova_kilometragem;
        }else{
            System.out.println("A quilometragem não pode ser negativa!");
        }
    }
    public void alterar_km_viajados(double km_viajados, boolean adicionar){
        if (adicionar) {
            if (km_viajados >= 0) {
                this.kilometragem += km_viajados;
            } else {
                System.out.println("A quilometragem percorrida não pode ser negativa.");
            }
        } else {
            System.out.println("O parâmetro 'adicionar' deve ser verdadeiro para adicionar quilometragem.");
        }
    }

    
    public void exibir(){
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + kilometragem + " km");

    }
}

//Crie uma classe `Carro` com atributos `marca`, `modelo`, `ano`, e `kilometragem`.
//Implemente métodos sobrecarregados para alterar a quilometragem do carro, onde um método aceita uma quilometragem total e outro aceita apenas a quilometragem percorrida em uma viagem.