package com.fundamentos_spingboot.fundamentos;

import com.fundamentos_spingboot.fundamentos.bean.BeanWpropiedades;
import com.fundamentos_spingboot.fundamentos.bean.MyBean;
import com.fundamentos_spingboot.fundamentos.component.ComponetDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner{
        private final ComponetDependency componetDependency;
        private MyBean myBean;
        private BeanWpropiedades beanWpropiedades;
       
        public FundamentosApplication(@Qualifier("componente2")ComponetDependency componetDependency,BeanWpropiedades beanWpropiedades, MyBean myBean){
            this.componetDependency = componetDependency;
            this.myBean = myBean;
            this.beanWpropiedades=beanWpropiedades;
        }
        
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

    @Override
    public void run(String... args){
        componetDependency.saludar();
        System.out.println(beanWpropiedades.funcion());
        myBean.print();
    }
        
}
