package com.crud.javalanches.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
@Entity
public class Cliente {
//ATRIBUTOS
 private long codigo_cliente;
 private String nome;
 private String email;
 private String telefone;
 private String cpf;
 private LocalDate dataNascimento;
 
 public Cliente(){
    
 }
}

