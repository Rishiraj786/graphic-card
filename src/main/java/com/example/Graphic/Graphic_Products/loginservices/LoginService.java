package com.example.Graphic.Graphic_Products.loginservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Graphic.Graphic_Products.logindomain.Login;
import com.example.Graphic.Graphic_Products.loginrepository.loginRepository;
 

@Service
public class LoginService {
@Autowired
private loginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByEmailAndPassword(username, password);
  return user;
 
}
}