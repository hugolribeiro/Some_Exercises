package entities;

public class SocorristaMoto implements Socorrista<Moto>{
    String nome;

    public SocorristaMoto(String nome){
        this.nome = nome;
    }

    @Override
    public void socorrer(Moto moto) {
        System.out.println("Socorrista " + this.nome + " está socorrendo uma moto.");
        System.out.println("Placa da moto: " + moto.getPlaca());
    }
}
