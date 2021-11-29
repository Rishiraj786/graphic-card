package com.example.Graphic.Graphic_Products.loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Graphic.Graphic_Products.logindomain.Login;
 

public interface loginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);
}
