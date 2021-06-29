package entities;

import java.math.BigDecimal;

public class Diretor extends FuncionarioCLT{

    static private final String cargo = "Diretor";
    static protected int horasSemanais = 36;
    static protected int horasDescansoSemanal = 4;
    static protected double bonificacaoMetaBatida = 0;
    static protected BigDecimal salarioBase = new BigDecimal("15000.00");
    private double participacaoLucros;

    public Diretor(String nome) {
        super(nome, cargo, horasSemanais, horasDescansoSemanal, bonificacaoMetaBatida, salarioBase);
        this.participacaoLucros = 3;
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public double pagarSalario() {
        return 0;
    }

    @Override
    public String toString() {
        return "\nNome: " + super.getNome() +
                "\nCargo: " + this.getCargo() +
                "\nHoras Semanais: " + this.getHorasSemanais() +
                "\nDescanso Remunerado " + this.getHorasDescansoRemunerado() +
                "\nSalario Base=" + this.getSalarioBase() +
                "\nBonificacao por meta batida=" + this.getBonificacaoMetaBatida() + "%" +
                "\nParticipacao nos lucros: " + this.getParticipacaoLucros();
    }
}
