package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Produit;

/**
 * 
 * @Repository:pour que les classes soit des bean spring pourqu'on puisse l'injecter
 *
 */
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
