package com.ent.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@RestController
public class ClienteController {
    @Autowired()
    ResCliente repository;

    @Autowired()
    ResAddress repositoryA;

    @GetMapping("hello")
    public  String getTEst() {
        return "/hello";
    }

    @GetMapping(path = "/clientes")
    public List<EntCliente> getUsuarios() {

        List<EntCliente> usuarios = repository.findAll();
        List<EntAddress> Address = repositoryA.findAll();
        for(EntCliente usuario: usuarios){
            for(EntAddress address: Address){
                if(address.getName().equals(usuario.getName())){
                    usuario.getDireccion().add(address);
                }
            }
        }
        return usuarios;
    }

    @GetMapping(path = "/address")
    public List<EntAddress> getAddress() {
        return repositoryA.findAll();
    }

    @PostMapping("/cliente")
    public EntCliente postTienda(@RequestBody EntCliente cliente) {

                return repository.save(cliente);
    }
}
