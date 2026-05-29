package com.desafio50dias;

public class Pessoa {
    public String nome;
    public String cpf;
    public int idade;

    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append("{\n");
        stb.append("    \"nome\": \"" + nome + "\",\n");
        stb.append("    \"cpf\": \"" + cpf + "\",\n");
        stb.append("    \"idade\": \"" + idade + "\"\n");
        stb.append("}\n");
        return stb.toString();
    }
}
