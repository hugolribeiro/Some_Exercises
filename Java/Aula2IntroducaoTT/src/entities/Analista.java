package entities;

import java.math.BigDecimal;

public class Analista extends FuncionarioCLT{

    static private final String cargo = "Analista";
    static protected int horasSemanais = 40;
    static protected int horasDescansoSemanal = 4;
    static protected double bonificacaoMetaBatida = 8;
    static protected BigDecimal salarioBase = new BigDecimal("4000.00");

    public Analista(String nome) {
        super(nome, cargo, horasSemanais, horasDescansoSemanal, bonificacaoMetaBatida, salarioBase);
    }

    @Override
    public double pagarSalario() {
        return 0;
    }
}
