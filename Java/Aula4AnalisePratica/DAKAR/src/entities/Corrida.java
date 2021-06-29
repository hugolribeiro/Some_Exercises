package entities;

import exception.CorridaException;

import java.math.BigDecimal;
import java.util.List;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int veiculosPermitidos;
    private List<Veiculo> listaVeiculos;

    public Corrida(double distancia, double premioEmDolares, String nome, int veiculosPermitidos, List<Veiculo> listaVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.veiculosPermitidos = veiculosPermitidos;
        this.listaVeiculos = listaVeiculos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVeiculosPermitidos() {
        return veiculosPermitidos;
    }

    public void setVeiculosPermitidos(int veiculosPermitidos) {
        this.veiculosPermitidos = veiculosPermitidos;
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) throws CorridaException {
        if (this.listaVeiculos.size() > this.veiculosPermitidos){
            throw new CorridaException("A corrida ja esta cheia!");
        }
        Carro novoCarro = new Carro(velocidade, aceleracao, anguloDeGiro, placa);
        listaVeiculos.add(novoCarro);
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        Moto novaMoto = new Moto(velocidade, aceleracao, anguloDeGiro, placa);
        listaVeiculos.add(novaMoto);
    }

    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
        listaVeiculos.removeIf(veiculo -> veiculo.getPlaca().equals(placa));
    }

    public Veiculo buscaPorPlaca(String placa){
        for (Veiculo veiculo:
             listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)){
                return veiculo;
            }
        }
        return null;
    }

    public Veiculo definirCampeao(){
        double valorMaximo = 0;
        Veiculo campeao = null;
        for (Veiculo veiculo:
             listaVeiculos) {
            double resultadoFormula = veiculo.getVelocidade() * veiculo.getAceleracao() /
                    (veiculo.getAnguloDeGiro()*(veiculo.getPeso() - veiculo.getRodas() * 100));
            if (resultadoFormula > valorMaximo){
                valorMaximo = resultadoFormula;
                campeao = veiculo;
            }
        }
        return campeao;
    }

    public void mostraVeiculos(){
        int contador = 1;
        for (Veiculo veiculo:
             listaVeiculos) {
            System.out.println("Veiculo " + contador);
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Velocidade: " + veiculo.getVelocidade());
            System.out.println();
            contador += 1;
        }
    }

    SocorristaMoto socorristaMoto = new SocorristaMoto("Carlos");
    SocorristaCarro socorristaCarro = new SocorristaCarro("Lourdes");

    public void socorrerMoto(String placa){
        socorristaMoto.socorrer((Moto)buscaPorPlaca(placa));
    }

    public void socorrerCarro(String placa){
        socorristaCarro.socorrer((Carro)buscaPorPlaca(placa));
    }
}
