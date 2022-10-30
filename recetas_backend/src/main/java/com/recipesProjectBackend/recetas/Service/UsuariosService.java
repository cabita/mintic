package com.recipesProjectBackend.recetas.Service;

import com.recipesProjectBackend.recetas.Models.Usuarios;
import java.util.List;

public interface UsuariosService {
     public Usuarios save(Usuarios usuarios);
     public void delete(Integer id);
     public Usuarios findById(Integer id);
     public List<Usuarios> findByAll();
}
