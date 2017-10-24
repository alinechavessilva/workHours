package br.com.greenMille.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import br.com.greenMille.models.User;
import br.com.greenMille.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
  private UserRepository repository;


  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public ResponseEntity<List<User>> listar() {
	  
	   Iterable<User> users = repository.findAll();
	   
    return new ResponseEntity<List<User>>((List<User>) users, HttpStatus.OK);
  }
  


}