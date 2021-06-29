package entities;

import boundary.Precedente;

public class Celular implements Precedente<Celular> {

    private Integer number;
    private Pessoa holder;

    public Celular(int number, Pessoa holder){
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Pessoa getHolder() {
        return holder;
    }

    public void setHolder(Pessoa holder) {
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.number.compareTo(celular.getNumber());
    }

    @Override
    public String toString() {
        return "Numero: " + number +
                "Portador: " + holder.getNome();
    }
}
