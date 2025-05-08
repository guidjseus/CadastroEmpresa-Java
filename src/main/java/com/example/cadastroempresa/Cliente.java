package com.example.cadastroempresa;

public class Cliente {

    private String nome;
    private String email;
    private String cpfCnpj;
    private String endereco;
    private String telefone;

    public Cliente(String nome,String email, String cpfCnpj, String endereco, String telefone) {
        this.nome = nome;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCpfCnpj(){
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj){
        this.cpfCnpj = cpfCnpj;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}
