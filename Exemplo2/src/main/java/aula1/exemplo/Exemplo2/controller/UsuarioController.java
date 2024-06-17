package aula1.exemplo.Exemplo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import aula1.exemplo.Exemplo2.model.Usuario;
import aula1.exemplo.Exemplo2.repository.UsuarioRepository;


@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/usuarios")
    public List<Usuario>getUser(){
        return repository.findAll();
    }
    @GetMapping("/usuario/{username}")
    public Usuario getOne(@PathVariable("username")String username){
        return repository.findByUsername(username);
    }
    @GetMapping("/usuario/{id}")
    public Usuario getId(@PathVariable("id")Integer id){
        return repository.findById(id);
    }
    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);

    }  
    
    @PostMapping("/usuarios")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

}
