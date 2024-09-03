public class Veiculo {
    String marca;
    String modelo;
    int ano;
    Motor motor;
    
    
    public Veiculo (String marca, String modelo, int ano, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }
    public void ligar_motor(){
        motor.ligado();
    }
    public void desligar_motor(){
        motor.desligado();
    }
    public void exibir_veiculo(){
        System.out.println("\nInformações do Veículo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        motor.exibir_motor();
    }
}








//Crie uma classe `Veiculo` com atributos `marca`, `modelo`, `ano`, e um objeto `Motor`.
//Implemente métodos em `Veiculo` para ligar e desligar o motor, além de exibir as informações completas do veículo e do motor.