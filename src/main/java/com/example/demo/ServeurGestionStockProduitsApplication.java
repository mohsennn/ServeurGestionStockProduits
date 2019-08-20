package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Produit;

@SpringBootApplication

public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);

//		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
//
//		produitRepository.save(new Produit("livre", 10, 200));
//		produitRepository.save(new Produit("livre", 10, 200));
//		produitRepository.save(new Produit("Stylo", 50, 60));

	}

}
