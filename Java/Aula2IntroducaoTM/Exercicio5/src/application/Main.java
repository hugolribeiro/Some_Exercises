/*
Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados,
métodos de acesso e o método toString, conforme explicamos no exercício anterior,
um método para verificar se a data está correta e outro para adicionar um dia ao valor atual da data.
A classe GregorianCalendar deve ser investigada e usada para implementar os construtores e métodos Date.
 */

package application;

import entities.Data;
import exceptions.DataException;

public class Main {
    public static void main(String[] args){
        try{
            Data dt = new Data(28, 02, 1992);
            dt.adicionaDia();
            dt.adicionaDia();
            System.out.println(dt.toString());
        } catch(DataException ex){
            System.out.println(ex.getMessage());
        }
    }
}
