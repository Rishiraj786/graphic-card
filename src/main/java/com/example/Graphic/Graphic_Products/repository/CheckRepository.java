package com.example.Graphic.Graphic_Products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Graphic.Graphic_Products.entity.CheckoutData;

 

public interface CheckRepository extends JpaRepository<CheckoutData, Integer>{

}
