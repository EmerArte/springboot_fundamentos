/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fundamentos_spingboot.fundamentos.component;

import org.springframework.stereotype.Component;

/**
 *
 * @author EL EMER
 */
@Component
public class ComponentImplement implements ComponetDependency{

    @Override
    public void saludar() {
            System.out.println("Hola Mundo");
        
    }
    
}
