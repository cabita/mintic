package com.recipesProjectBackend.recetas.Service;

import com.recipesProjectBackend.recetas.Models.Recipe2;
import java.util.List;

public interface Recipe2Service {
     public Recipe2 save(Recipe2 recipe2);
     public void delete(Integer id);
     public Recipe2 findById(Integer id);
     public List<Recipe2> findByAll();
}