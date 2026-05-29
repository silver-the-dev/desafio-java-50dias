package org.silverio;

public class Pessoa {
    public String nome;
    public String estadoCivil;

    public Pessoa(String nome, String estadoCivil){
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil(){
        return estadoCivil;
    }
}
