public class Motor_Lista3 {
    private int potencia;
    private String tipoCombustivel;

    public Motor_Lista3(int potencia, String tipoCombustivel){
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void exibir(){
        System.out.println("Potência: " + potencia);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}


//Crie uma classe Motor com atributos como potencia e tipoCombustivel. 
//Implemente métodos para exibir informações sobre o carro e seu motor.
