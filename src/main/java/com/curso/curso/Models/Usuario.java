package com.curso.curso.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario {
    @Getter @Setter @Column(name = "name")
    private String nombre;
    @Getter @Setter @Column(name = "lastname")
    private String lastName;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "telephone")
    private Integer telephone;
    @Getter @Setter @Column(name = "password")
    private String password;
    @Getter @Setter @Column(name = "id")
    private Long id;

}

