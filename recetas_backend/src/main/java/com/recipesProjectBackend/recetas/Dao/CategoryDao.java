
package com.recipesProjectBackend.recetas.Dao;

import com.recipesProjectBackend.recetas.Models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Integer>{
    
}
