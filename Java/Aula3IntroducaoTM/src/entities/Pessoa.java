package entities;

import boundary.Precedente;

public class Pessoa implements Precedente <Pessoa>{

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//Comparacao com nome das pessoas
    @Override
    public int precedeA(Pessoa p) {
        return this.nome.compareToIgnoreCase(p.getNome());
//        return this.cpf.compareToIgnoreCase(p.getCpf());
    }


    @Override
    public String toString() {
        return "\n\nNome : " + nome +
                "\nCpf: " + cpf
                ;
    }
}
