package br.com.greenMille.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import br.com.greenMille.models.Users;
import br.com.greenMille.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
  private UserRepository repository;


  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public ResponseEntity<List<Users>> listar() {
	  
	   Iterable<Users> users = repository.findAll();
	   
    return new ResponseEntity<List<Users>>((List<Users>) users, HttpStatus.OK);
  }
  
  @RequestMapping(value = "/users/add", method = RequestMethod.GET)
  public ResponseEntity<Users> salvar(@RequestParam Users user) {
	  
	  repository.save(user);
	   
    return new ResponseEntity<Users>(user, HttpStatus.OK);
  }
 

}