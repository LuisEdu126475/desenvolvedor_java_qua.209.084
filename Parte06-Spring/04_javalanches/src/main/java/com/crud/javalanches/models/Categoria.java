package com.crud.javalanches.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;




@Entity
public class Categoria {
private static long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(unique = true , nullable = false)
private long codigoCliente;
@Column(unique = true, nullable = false)
private String nomeCategoria;


    public Categoria() {
    }

    public long getCodigoCliente() {
        return this.codigoCliente;
    }

    public void setCodigoCliente(long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

}
