public class Motor {
    float potencia;
    String tipo_combustivel;
    boolean estado;
    

    public Motor (float potencia, String tipo_combustivel){
        this.potencia = potencia;
        this.tipo_combustivel = tipo_combustivel;
        this.estado = false;
    }
    public void ligado() {
        if (!estado) {
            estado = true;
            System.out.println("Motor ligado.");
        } else {
            System.out.println("Motor já está ligado.");
        }
    }
    public void desligado() {
        if (estado) {
            estado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("Motor já está desligado.");
        }
    }
    public void exibir_motor(){
        System.out.println("Informações do Motor: " );
        System.out.println("Potência: " + potencia);
        System.out.println("Tipo de Combustível: " + tipo_combustivel);
        System.out.println("Estado: " + (estado ? "Ligado" : "Desligado"));
    }
}



//Crie uma classe `Motor` com atributos `potencia`, `tipoCombustivel`, e `estado`.
