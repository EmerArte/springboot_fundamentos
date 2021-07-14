package com.fundamentos_spingboot.fundamentos;

import com.fundamentos_spingboot.fundamentos.component.ComponetDependency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner{
        private final ComponetDependency componetDependency;
       
        public FundamentosApplication(ComponetDependency componetDependency){
            this.componetDependency = componetDependency;
        }
        
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

    @Override
    public void run(String... args){
        componetDependency.saludar();
    }
        
}
