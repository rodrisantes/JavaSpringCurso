package com.curso.curso.dao;

import com.curso.curso.Models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    private EntityManager entitymanager;


    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
    String query = "FROM Usuario";
    return entitymanager.createQuery(query).getResultList();




    }
}
