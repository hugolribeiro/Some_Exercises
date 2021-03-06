package entities;

import exceptions.DenominadorException;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(){
        this.numerador = 1;
        this.denominador = 1;
    }

    public Fracao(int numerador, int denominador) throws DenominadorException {
        if (denominador == 0){
            throw new DenominadorException("O denominador não pode ser zero!");
        } else{
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }

    public Fracao(Fracao segundaFracao){
        this.numerador = segundaFracao.getNumerador();
        this.denominador = segundaFracao.getDenominador();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) throws DenominadorException {
        if (denominador == 0) {
            throw new DenominadorException("O denominador não pode ser zero!");
        }
        this.denominador = denominador;
    }

    public void adicionar(Fracao segundaFracao){

        if (this.denominador != segundaFracao.getDenominador()){
            Fracao copiaSegunda = new Fracao(segundaFracao);
            int denominadorComum = this.denominador * copiaSegunda.denominador;
            this.numerador = denominadorComum / this.denominador * this.numerador;
            copiaSegunda.setNumerador(denominadorComum / copiaSegunda.getDenominador() * copiaSegunda.getNumerador());
            this.denominador = denominadorComum;
            this.numerador += copiaSegunda.getNumerador();
        }else{
            this.numerador += segundaFracao.getNumerador();
        }
    }

    public void adicionar(int numeroInteiro) throws DenominadorException {
        Fracao fracaoComUm = new Fracao(numeroInteiro, 1);
        adicionar(fracaoComUm);
    }

    public void subtrair(Fracao segundaFracao){
        if (this.denominador != segundaFracao.getDenominador()){
            Fracao copiaSegunda = new Fracao(segundaFracao);
            int denominadorComum = this.denominador * copiaSegunda.denominador;
            this.numerador = denominadorComum / this.denominador * this.numerador;
            copiaSegunda.setNumerador(denominadorComum / copiaSegunda.getDenominador() * copiaSegunda.getNumerador());
            this.denominador = denominadorComum;
            this.numerador -= copiaSegunda.getNumerador();
        }
        this.numerador -= segundaFracao.getNumerador();
    }

    public void subtrair(int numeroInteiro) throws DenominadorException {
        Fracao fracaoComUm = new Fracao(numeroInteiro, 1);
        subtrair(fracaoComUm);
    }

    public void multiplicar(Fracao segundaFracao){
        this.numerador *= segundaFracao.getNumerador();
        this.denominador *= segundaFracao.getDenominador();
    }

    public void multiplicar(int numeroInteiro){
        this.numerador *= numeroInteiro;
    }

    public void dividir(Fracao segundaFracao){
        this.numerador *= segundaFracao.getDenominador();
        this.denominador *= segundaFracao.getNumerador();
    }

    public void dividir(int numeroInteiro){
        this.denominador *= numeroInteiro;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
