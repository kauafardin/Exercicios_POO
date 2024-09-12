public class PlacaMae_Lista3 {
    private String modelo;

    public PlacaMae_Lista3(String modelo){
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    } 
    public void exibir(){
        System.out.println("Modelo da Placa Mãe: " + modelo);
    }
}
