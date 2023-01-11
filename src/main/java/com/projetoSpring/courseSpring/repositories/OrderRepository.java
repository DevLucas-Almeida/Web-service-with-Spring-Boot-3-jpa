package com.projetoSpring.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.courseSpring.enteties.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
