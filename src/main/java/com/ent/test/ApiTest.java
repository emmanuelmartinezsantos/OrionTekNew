package com.ent.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApiTest {
	
	@Autowired
	Environment environment;

    @GetMapping(path = "/hello/{msn}")
	public String getHolla(@PathVariable String msn) {
    	String port = environment.getProperty("local.server.port");
		return "Hola "+ msn + " app ejecutándose en puerto "+port;
	}
    
    @GetMapping(path = "/listaNumeros/{numero}")
    public List<Integer> listaNumeros(@PathVariable("numero")  int max){
    	List<Integer> lista = new ArrayList<Integer>();
    	for(int index=0; index < max; index++) {
    		lista.add(index+1);
    	}
    	return lista;
    }
    
}
