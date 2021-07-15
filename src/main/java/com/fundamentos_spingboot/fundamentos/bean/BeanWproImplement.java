/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fundamentos_spingboot.fundamentos.bean;

/**
 *
 * @author EL EMER
 */
public class BeanWproImplement implements BeanWpropiedades{
    private String nombre, apellido, random;
    public BeanWproImplement(String nombre, String apellido,String random){
        this.nombre=nombre;
        this.apellido=nombre;
        this.random=random;
    }
    @Override
    public String funcion() {
        return nombre + "-" + apellido + "--" + random;
    }
    
}
