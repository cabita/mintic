package com.recipesProjectBackend.recetas.Service;

import com.recipesProjectBackend.recetas.Models.Category;
import java.util.List;

public interface CategoryService {
     public Category save(Category category);
     public void delete(Integer id);
     public Category findById(Integer id);
     public List<Category> findByAll();
}
