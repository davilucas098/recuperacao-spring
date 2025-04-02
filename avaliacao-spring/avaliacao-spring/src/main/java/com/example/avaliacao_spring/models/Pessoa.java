package com.example.avaliacao_spring.models;

public class Pessoa {
  
   private String nome;

   private String cpf;

   private Integer idade;

   public Pessoa(String nome, String cpf, Integer idade) {
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
   }

   public String getNome(){
    return nome;
   }

   public void setNome(String nome){
    if (idade >= 18) {
        this.nome = nome;
    } else {
        throw new IllegalArgumentException("Apenas maiores de 18 anos podem trocar de nome.");
    }
   }

   public String getCpf() {
    return cpf;
   }
   public void setCpf(String cpf){
     this.cpf = cpf;
   }

   public Integer getIdade(){
    return idade;
   }

   public void setIdade(Integer idade){
    this.idade = idade;
   }

}
