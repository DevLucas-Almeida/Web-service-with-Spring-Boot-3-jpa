package com.projetoSpring.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.courseSpring.enteties.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
