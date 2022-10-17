package com.recipesProjectBackend.recetas.Service.Implement;

import com.recipesProjectBackend.recetas.Dao.Recipe2Dao;
import com.recipesProjectBackend.recetas.Models.Recipe2;
import com.recipesProjectBackend.recetas.Service.Recipe2Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Recipe2ServiceImpl implements Recipe2Service {
    @Autowired
    private Recipe2Dao recipe2Dao;
    
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
       recipe2Dao.deleteById(id);
    }    
        
    @Override
    @Transactional(readOnly=false)
    public Recipe2 save(Recipe2 recipe2) {
        return recipe2Dao.save(recipe2);
    }  
    
    @Override
    @Transactional(readOnly=true)
    public Recipe2 findById(Integer id) {
       return recipe2Dao.findById(id).orElse(null);
    }    

    @Override
    @Transactional(readOnly=true)
    public List<Recipe2> findByAll() {
        return (List<Recipe2>) recipe2Dao.findAll();
    }
 
}

