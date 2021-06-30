package entities;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    private Integer contador = 0;
    private HashMap<Integer, List<Vestuario>> dicionarioRoupas = new HashMap<>();


    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        dicionarioRoupas.put(contador, listaDeVestuario);
        contador += 1;
        return contador;
    }

    public List<Vestuario> devolverVestuarios(Integer id){
        List<Vestuario> vestuarios = dicionarioRoupas.get(id);
        dicionarioRoupas.remove(id);
        return vestuarios;
    }

    public void mostrarVestuarios(){
        for (int chave:
             dicionarioRoupas.keySet()) {
            System.out.println("-----------------");
            System.out.println("Chave: " + chave);
            for (Vestuario vestuario: dicionarioRoupas.get(chave)){
                System.out.println(vestuario);
            }
        }
    }
}
