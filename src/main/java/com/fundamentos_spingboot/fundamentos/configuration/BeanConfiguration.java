/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fundamentos_spingboot.fundamentos.configuration;

import com.fundamentos_spingboot.fundamentos.bean.MyBean;
import com.fundamentos_spingboot.fundamentos.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author EL EMER
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement();
    }
}
