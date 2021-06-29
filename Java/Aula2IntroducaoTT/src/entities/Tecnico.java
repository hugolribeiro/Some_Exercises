package entities;

import java.math.BigDecimal;

public class Tecnico extends FuncionarioCLT{

    static private final String cargo = "Tecnico";
    protected static int horasSemanais = 40;
    protected static int horasDescansoSemanal = 0;
    protected static BigDecimal salarioBase = new BigDecimal("3200.00");
    protected static double bonificacaoMetaBatida = 5;

    public Tecnico(String nome) {
        super(nome, cargo, horasSemanais, horasDescansoSemanal, bonificacaoMetaBatida, salarioBase);
            super.nome = nome;
    }

    @Override
    public double pagarSalario() {
        return 0;
    }

}
