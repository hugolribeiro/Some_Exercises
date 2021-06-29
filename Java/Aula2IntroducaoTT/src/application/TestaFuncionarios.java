package application;

import entities.Diretor;
import entities.Tecnico;

import java.math.BigDecimal;

public class TestaFuncionarios {

    public static void main(String[] args) {
        Tecnico tec1 = new Tecnico("Matheus");
        System.out.println(tec1.toString());
        BigDecimal bg = new BigDecimal("4500.00");
        tec1.setSalarioBase(bg);
        System.out.println(tec1.toString());
        Tecnico tec2 = new Tecnico("Joao");
        System.out.println(tec2.toString());
        BigDecimal bg1 = new BigDecimal("1500");
        tec2.setSalarioBase(bg1);
        System.out.println(tec2);
        System.out.println(tec1);

        Diretor dir1 = new Diretor("Alfredo");
        System.out.println(dir1);
    }


}
