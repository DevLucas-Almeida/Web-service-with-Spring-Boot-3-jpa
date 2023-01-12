package com.projetoSpring.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.courseSpring.enteties.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
