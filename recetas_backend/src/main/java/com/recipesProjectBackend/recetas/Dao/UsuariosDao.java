package com.recipesProjectBackend.recetas.Dao;

import com.recipesProjectBackend.recetas.Models.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosDao extends CrudRepository<Usuarios, Integer> {
    
}
