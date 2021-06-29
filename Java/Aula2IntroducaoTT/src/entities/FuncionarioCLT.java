package entities;

import java.math.BigDecimal;

public abstract class FuncionarioCLT extends Funcionario{
    protected String cargo;
    protected int horasSemanais;
    protected int horasDescansoRemunerado;
    protected double bonificacaoMetaBatida;

    public FuncionarioCLT(String nome, String cargo, int horasSemanais,
                          int horasDescansoSemanal,
                          double bonificacaoMetaBatida, BigDecimal salarioBase) {
        super(nome, salarioBase);
        this.cargo = cargo;
        this.horasSemanais = horasSemanais;
        this.horasDescansoRemunerado = horasDescansoSemanal;
        this.bonificacaoMetaBatida = bonificacaoMetaBatida;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public int getHorasDescansoRemunerado() {
        return horasDescansoRemunerado;
    }

    public void setHorasDescansoRemunerado(int horasDescansoRemunerado) {
        this.horasDescansoRemunerado = horasDescansoRemunerado;
    }

    public double getBonificacaoMetaBatida() {
        return bonificacaoMetaBatida;
    }

    public void setBonificacaoMetaBatida(double bonificacaoMetaBatida) {
        this.bonificacaoMetaBatida = bonificacaoMetaBatida;
    }

    @Override
    public abstract double pagarSalario();

    @Override
    public String toString() {
        return "\nNome: " + super.getNome() +
                "\nCargo: " + this.getCargo() +
                "\nHoras Semanais: " + this.getHorasSemanais() +
                "\nDescanso Remunerado " + this.getHorasDescansoRemunerado() +
                "\nSalario Base=" + this.getSalarioBase() +
                "\nBonificacao por meta batida=" + this.getBonificacaoMetaBatida() + "%"
                ;
    }
}
