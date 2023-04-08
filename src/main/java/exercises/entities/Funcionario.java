package exercises.entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;
    double salarioLiquido;


    double incrementoSalario;

    public void taxa(){
        this.taxa = taxa / 100;
    }

    public double salarioLiquido(){
        return this.salarioLiquido = salarioBruto - taxa;

    }

    public double incrementoSalario(){
        return this.incrementoSalario = (salarioBruto * (taxa/100)) + this.salarioLiquido;
    }
}
