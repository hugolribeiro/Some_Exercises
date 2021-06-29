package boundary;

import control.SortUtil;
import entities.Celular;
import entities.Pessoa;


public class application {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", "223.339.130-31");
        Pessoa p2 = new Pessoa("Maria", "083.039.133-13");
        Pessoa p3 = new Pessoa("Carlos", "931.933.103-03");

        Pessoa[] pessoas = {p1, p2, p3};

        SortUtil.organiza(pessoas);

        for (Pessoa pessoa:
             pessoas) {
            System.out.println(pessoa);
        }

        Celular[] celulares = {
                new Celular(991339312, p3),
                new Celular(999332312, p2),
                new Celular(998329312, p1)
        };

        SortUtil.organiza(celulares);

        for(Celular celular: celulares){
            System.out.println(celular);
        }
    }
}
