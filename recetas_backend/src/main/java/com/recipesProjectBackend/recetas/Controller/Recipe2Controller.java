
package com.recipesProjectBackend.recetas.Controller;

import com.recipesProjectBackend.recetas.Models.Recipe2;
import com.recipesProjectBackend.recetas.Service.Recipe2Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/recipe2")
public class Recipe2Controller {
  @Autowired
  private Recipe2Service recipe2Service;
  
  @PostMapping(value="/create") 
  public ResponseEntity<Recipe2> add(@RequestBody Recipe2 recipe2){
     Recipe2 obj = recipe2Service.save(recipe2);
     return new ResponseEntity<>(obj, HttpStatus.OK);
  }
  
  @DeleteMapping(value="/delete/{id}")
  public ResponseEntity<Recipe2> deleteItem(@PathVariable Integer id) {
      Recipe2 obj = recipe2Service.findById(id);
      if(obj != null) {
          recipe2Service.delete(id);
      } else {
          return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
      }
      return new ResponseEntity<>(obj, HttpStatus.OK);
  }
  
    @PutMapping(value="/update")
    public ResponseEntity<Recipe2> updateItem(@RequestBody Recipe2 recipe2) {
      Recipe2 obj = recipe2Service.findById(recipe2.getId_recipe2());
      if(obj != null) {
          obj.setTitle(recipe2.getTitle());
          obj.setDescription(recipe2.getDescription());
          obj.setId_category(recipe2.getId_category());
          obj.setImage(recipe2.getImage());
          recipe2Service.save(obj);
      } else {
          return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
      }
      return new ResponseEntity<>(obj, HttpStatus.OK);
  }
      
  @GetMapping("/list")
  public List<Recipe2> getAllCategories() {
      return recipe2Service.findByAll();
  }
  
  @GetMapping("/list/{id}")
  public Recipe2 getCategoryById(@PathVariable Integer id) {
      return recipe2Service.findById(id);
  }
}
