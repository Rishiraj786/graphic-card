package com.example.Graphic.Graphic_Products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Graphic.Graphic_Products.entity.ContactData;

 

public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}
