package com.projetoSpring.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.courseSpring.enteties.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
