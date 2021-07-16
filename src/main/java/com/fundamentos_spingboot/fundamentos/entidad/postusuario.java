/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fundamentos_spingboot.fundamentos.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author EL EMER
 */
@Entity
@Table(name="postusuario")
public class postusuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_post" , nullable=false, unique=true)
    private long id;
    @Column(name = "descripcion",length=255)
    private String descripcion;
    @ManyToOne
    private usuario user;

    public postusuario() {
    }

    public postusuario(String descripcion, usuario user) {
        this.descripcion = descripcion;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public usuario getUser() {
        return user;
    }

    public void setUser(usuario user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "postusuario{" + "id=" + id + ", descripcion=" + descripcion + ", user=" + user + '}';
    }
    
    
}
