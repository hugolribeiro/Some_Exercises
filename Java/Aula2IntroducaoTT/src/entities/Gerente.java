package entities;

import java.math.BigDecimal;

public class Gerente extends FuncionarioCLT{

    static private final String cargo = "Gerente";
    static protected int horasSemanais = 36;
    static protected int horasDescansoSemanal = 4;
    static protected double bonificacaoMetaBatida = 12.5;
    static protected BigDecimal salarioBase = new BigDecimal("6000.00");

    public Gerente(String nome) {
        super(nome, cargo, horasSemanais, horasDescansoSemanal, bonificacaoMetaBatida, salarioBase);
    }

    @Override
    public double pagarSalario() {
        return 0;
    }
}
