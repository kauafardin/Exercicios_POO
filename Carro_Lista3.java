public class Carro_Lista3 {
    private Motor_Lista3 motor;

    public Carro_Lista3(int potencia, String tipoCombustivel){
        this.motor = new Motor_Lista3(potencia, tipoCombustivel);
    }

    public void exibir(){
        motor.exibir();
    }
}

//Em seguida, crie uma classe Carro que tenha um motor como parte integrante. 
//No construtor da classe Carro, instancie o motor. 