package com.digitalbank.model;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String CPF;
    private String email;
    private LocalDate dataDeNascimento;
    private String celular;

    public Cliente() {}

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDataDeNascimento() { return dataDeNascimento; }
    public void setDataDeNascimento(LocalDate dataDeNascimento) { this.dataDeNascimento = dataDeNascimento; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
}
