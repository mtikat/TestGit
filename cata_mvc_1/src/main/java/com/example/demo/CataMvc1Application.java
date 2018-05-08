package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Produit;

@SpringBootApplication
public class CataMvc1Application {

	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(CataMvc1Application.class, args);
		ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("LX 4352", 670, 90));
		produitRepository.save(new Produit("Ord HP 432", 670, 90));
		produitRepository.save(new Produit("Imprimante Epson", 450, 12));
		produitRepository.save(new Produit("Imp HP 5400", 45, 10));
		
		produitRepository.findAll().forEach((p->System.out.println(p.getDesignation())));
	}
}
