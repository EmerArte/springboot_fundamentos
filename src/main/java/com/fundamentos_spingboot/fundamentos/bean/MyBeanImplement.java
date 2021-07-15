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
public class MyBeanImplement implements MyBean{

    @Override
    public void print() {
        System.out.println("IMPLEMENTACION PROPIA DEL BEAN");
    }
    
}
