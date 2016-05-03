/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administradorclaves.persistencia.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

import com.administradorclaves.persistencia.entidad.Usuario;
import java.util.Date;

/**
 *
 * @author lucka
 */
public class UsuarioDAO {
    public UsuarioDAO() {
        
    }
    
    public void crearUsuario() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AdministradorClavesPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        Usuario usuario = new Usuario();
        usuario.setNomUsuario("lucka185");
        usuario.setClave("123456");
        usuario.setFechaRegistro(new Date());
        usuario.setFechaActualizacion(new Date());
        
        entityManager.persist(usuario);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
