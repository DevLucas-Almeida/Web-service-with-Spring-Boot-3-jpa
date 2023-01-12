package com.projetoSpring.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.courseSpring.enteties.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
