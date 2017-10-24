package br.com.greenMille.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.greenMille.models.RegisterHours;
import br.com.greenMille.repository.RegisterHoursRepository;

@RestController
public class RegisterHoursController {
	
	@Autowired
	  private RegisterHoursRepository repository;


	  @RequestMapping(value = "/registers", method = RequestMethod.GET)
	  public ResponseEntity<List<RegisterHours>> listar() {
		  
		   Iterable<RegisterHours> registers = repository.findAll();
		   
	    return new ResponseEntity<List<RegisterHours>>((List<RegisterHours>) registers, HttpStatus.OK);
	  }
	  
	  @RequestMapping(value = "/registers/add", method = RequestMethod.GET)
	  public ResponseEntity<RegisterHours> salvar(@RequestParam RegisterHours registerHours) {
		  
		  repository.save(registerHours);
		 
		   
	    return new ResponseEntity<RegisterHours>(registerHours, HttpStatus.OK);
	  }
	  
	  
	  @RequestMapping(value = "/registers/search", method = RequestMethod.GET)
	  public ResponseEntity<List<RegisterHours>> buscar(@RequestParam("time_initial") String time_initial, @RequestParam("time_final") String time_final) {
		  
		   Iterable<RegisterHours> registers = (Iterable<RegisterHours>) repository.findByTime( time_initial,  time_final);
		   
		   
	    return new ResponseEntity<List<RegisterHours>>((List<RegisterHours>) registers, HttpStatus.OK);
	  }
	  
	  
	  @RequestMapping(value = "/registers/searchByUserId", method = RequestMethod.GET)
	  public ResponseEntity<List<RegisterHours>> buscar(@RequestParam("userId") Long userId) {
		  
		   Iterable<RegisterHours> registers = (Iterable<RegisterHours>) repository.findByUserId(userId);
		   
		   
	    return new ResponseEntity<List<RegisterHours>>((List<RegisterHours>) registers, HttpStatus.OK);
	  }

}
