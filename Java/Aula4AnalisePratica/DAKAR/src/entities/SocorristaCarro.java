package entities;

public class SocorristaCarro implements Socorrista<Carro>{
    String nome;

    public SocorristaCarro(String nome){
        this.nome = nome;
    }


    @Override
    public void socorrer(Carro carro) {
        System.out.println("O socorrista " + this.nome + " está socorrendo um carro");
        System.out.println("Placa: " + carro.getPlaca());
    }
}
