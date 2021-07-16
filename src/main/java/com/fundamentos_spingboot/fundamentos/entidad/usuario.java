/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fundamentos_spingboot.fundamentos.entidad;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author EL EMER
 */
@Entity
@Table(name = "usuario")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false, unique = true)
    private long id;

    @Column(length = 50)
    private String nombre;
    @Column(length = 50)
    private String email;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<postusuario> post = new ArrayList<>();

    public usuario() {
    }

    public usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<postusuario> getPost() {
        return post;
    }

    public void setPost(List<postusuario> post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", post=" + post + '}';
    }

}
