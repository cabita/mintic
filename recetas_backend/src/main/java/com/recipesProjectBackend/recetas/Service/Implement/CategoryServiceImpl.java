package com.recipesProjectBackend.recetas.Service.Implement;

import com.recipesProjectBackend.recetas.Dao.CategoryDao;
import com.recipesProjectBackend.recetas.Models.Category;
import com.recipesProjectBackend.recetas.Service.CategoryService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    
    @Override
    @Transactional(readOnly=false)
    public Category save(Category category) {
        return categoryDao.save(category);
    }  
    
    @Override
    @Transactional(readOnly=true)
    public Category findById(Integer id) {
       return categoryDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
       categoryDao.deleteById(id);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Category> findByAll() {
        return (List<Category>) categoryDao.findAll();
    }
 
}
