package com.ent.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApiUsuario {
	
	@Autowired
	private RespUsuario repository;
	
	@GetMapping(path = "/usuarios")
	List<EntUsuario> getUsuarios() {	
    	return repository.findAll();
	}
	
	@PostMapping("/usuario")
	EntUsuario postTienda(@RequestBody EntUsuario tienda) {
		return repository.save(tienda);
	}
	
	@DeleteMapping("/borrarUsuario/{id}")  
	public void deleteUser(@PathVariable long id)  
	{  
		repository.deleteById(id);   
	}  
}
