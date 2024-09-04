public class Funcionario_ABC {
    int codigo;
    float qtd_horas;
    float valor_hora;
    float valor_salario;
    float qtd_horas_extras;

    public Funcionario_ABC(int codigo, float qtd_horas, float valor_hora){
        this.codigo = codigo;
        this.qtd_horas = qtd_horas;
        this.valor_hora = valor_hora;
    }
    public float calcular_hora_extra(){
        float porcentagem_hr_extra = 1.5f * valor_hora;
        return qtd_horas_extras * porcentagem_hr_extra; 
    }
    public float calcular_salario(){
        valor_salario = (valor_hora * qtd_horas) + calcular_hora_extra(); 
        return valor_salario;
    }
    public void exibir(){
        System.out.println("\nCódigo: " + codigo + "\nSalário: R$" + valor_salario + "\nHoras trabalhadas: " + qtd_horas);
    }
}
