/*
Crie uma classe Fracao com métodos necessários para adicionar, subtrair, multiplicar e
dividir frações. Todos os métodos devem ser sobrecarregados para que também possam
ser usados para operar entre frações e números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).
 */
package application;

import entities.Fracao;
import exceptions.DenominadorException;

public class Main {
    public static void main(String[] args) {

        try{
            Fracao fracao1 = new Fracao(1, 5);
            fracao1.adicionar(1);
            System.out.println(fracao1);
        }catch(DenominadorException e){
            System.out.println(e.getMessage());
        }

        Fracao fracao2 = new Fracao();
        fracao2.setNumerador(10);
        try{
            fracao2.setDenominador(0);
        }catch(DenominadorException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fracao2);

    }
}
