package com.gestao.convidados.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable {

@Id
@GeneratedValue(generator = "increment")
@GenericGenerator(name = "increment", strategy = "increment")
private Long id;
private String nome;
private Integer quantidadeAcompanhantes;
// getters e setters omitidos
}