package boundary;

import entities.GuardaRoupa;
import entities.Vestuario;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vestuario vest1 = new Vestuario("Nike", "Sport");
        Vestuario vest2 = new Vestuario("Adidas", "Casual");

        List<Vestuario> vestuarios = new ArrayList<Vestuario>();
        vestuarios.add(vest1);
        vestuarios.add(vest2);

        GuardaRoupa guardaRoupa = new GuardaRoupa();

        guardaRoupa.guardarVestuarios(vestuarios);

        guardaRoupa.mostrarVestuarios();

        System.out.println("------------Outra pesquisa---------");
        List<Vestuario> vestuarios2 = new ArrayList<Vestuario>();
        vestuarios2.add(new Vestuario("Kaboing", "a4133"));
        vestuarios2.add(new Vestuario("Office now", "Atual"));

        guardaRoupa.guardarVestuarios(vestuarios2);

        guardaRoupa.mostrarVestuarios();

        System.out.println("------- Retirando as roupas da chave 1 -------");
        List<Vestuario> vestuariosRetirados = guardaRoupa.devolverVestuarios(1);
        for (Vestuario vestuario:
             vestuariosRetirados) {
            System.out.println("\nVestuário retirado: " + "\nMarca: " + vestuario.getMarca()+
                              "\nModelo: " + vestuario.getModelo());
        }

        System.out.println("\n------Pesquisa apos retirada de vestuarios-------");
        guardaRoupa.mostrarVestuarios();

    }
}
