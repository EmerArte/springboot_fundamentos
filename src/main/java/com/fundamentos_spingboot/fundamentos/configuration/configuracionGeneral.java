/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fundamentos_spingboot.fundamentos.configuration;

import com.fundamentos_spingboot.fundamentos.bean.BeanWproImplement;
import com.fundamentos_spingboot.fundamentos.bean.BeanWpropiedades;
import javax.activation.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author EL EMER
 */
@Configuration
public class configuracionGeneral {
    @Value("${value.name}")
    private String nombre;
    @Value("${value.apellido}")
    private String apellido;
    @Value("${value.random}")
    private String random;
    
    
    @Bean
    public BeanWpropiedades function(){
        return new BeanWproImplement(nombre,apellido,random);
    }
    
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder build = DataSourceBuilder.create();
        build.driverClassName("org.h2.Driver");
        build.url("jbdc:h2:mem:testdb");
        build.username("sa");
        build.password("");
        return (DataSource) build.build();
    }
}
