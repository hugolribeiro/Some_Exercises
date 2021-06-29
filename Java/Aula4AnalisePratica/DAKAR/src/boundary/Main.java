package boundary;

import entities.*;
import exception.CorridaException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro(180, 50, 67, "ABC-9789"));
        veiculos.add(new Carro(185, 47, 69, "DEF-1234"));
        veiculos.add(new Moto(150, 55, 85, "MOT-9876"));
        Corrida corrida = new Corrida(2500, 54980, "Grande Corrida",
                                     15, veiculos);
        try{
            corrida.registrarCarro(190, 55, 50, "CAD-9313");
        } catch(CorridaException e){
            System.out.println(e.getMessage());
        }

        corrida.mostraVeiculos();

        corrida.removerVeiculoPorPlaca("MOT-9876");

        System.out.println(corrida.getPremioEmDolares());

        Veiculo campeao = corrida.definirCampeao();
        System.out.println("O campeao da corrida é o veiculo: \n" +
                "Placa: " + campeao.getPlaca() + "\n");

        corrida.mostraVeiculos();

        corrida.removerVeiculo(veiculos.get(2));

        corrida.mostraVeiculos();

        veiculos.add(new Moto(160, 55, 85, "MTR-1385"));
        corrida.socorrerCarro("DEF-1234");
        corrida.socorrerMoto("MTR-1385");
    }
}
