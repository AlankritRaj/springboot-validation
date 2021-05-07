package com.springboot.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.validation.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
