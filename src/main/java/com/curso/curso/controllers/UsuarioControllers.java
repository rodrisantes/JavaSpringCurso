package com.curso.curso.controllers;

import com.curso.curso.Models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioControllers {


    @RequestMapping(value = "/usuarios/{id}")
    public List <Usuario> getUsuario(@PathVariable Long id) {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Rodrigo");
        usuario.setApellido("Santesteban");
        usuario.setEmail("rodrisantes89@gmail.com");
        usuario.setTelephone(1126820158);

        return usuarios;
    }
        @RequestMapping(value = "/usuarios")
    public List <Usuario> getUsuarios() {
    List <Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Rodrigo");
        usuario.setApellido("Santesteban");
        usuario.setEmail("rodrisantes89@gmail.com");
        usuario.setTelephone(1126820158);

        Usuario usuario2 = new Usuario();
        usuario2.setId(241123L);
        usuario2.setNombre("Sebastian");
        usuario2.setApellido("Gonzalez");
        usuario2.setEmail("sebagonzalez89@gmail.com");
        usuario2.setTelephone(1123312124);

        Usuario usuario3 = new Usuario();
        usuario3.setId(231342L);
        usuario3.setNombre("Adrian");
        usuario3.setApellido("Perez");
        usuario3.setEmail("adrianperez89@gmail.com");
        usuario3.setTelephone(1124432123);

        usuarios.add(usuario3);
        usuarios.add(usuario2);
        usuarios.add(usuario);
        return usuarios;
    }


}