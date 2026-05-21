package com.crud.javalanches.models;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Produto {
    private static long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private long codigoProduto;

@Column (unique = true , nullable = false)
private String nomeProduto;
@Column(length = 255)
private String descricaoProduto;
@Column(precision = 10 , scale = 2)
private BigDecimal precoProduto;
}
