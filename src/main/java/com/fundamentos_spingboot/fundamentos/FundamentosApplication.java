package com.fundamentos_spingboot.fundamentos;

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
       
        public FundamentosApplication(@Qualifier("componente2")ComponetDependency componetDependency, MyBean myBean){
            this.componetDependency = componetDependency;
            this.myBean = myBean;
        }
        
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

    @Override
    public void run(String... args){
        componetDependency.saludar();
        myBean.print();
    }
        
}
