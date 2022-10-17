
package com.recipesProjectBackend.recetas.Controller;

import com.recipesProjectBackend.recetas.Models.Category;
import com.recipesProjectBackend.recetas.Service.CategoryService;
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
@RequestMapping("/category")
public class CategoryController {
  @Autowired
  private CategoryService categoryService;
  
  @PostMapping(value="/create") 
  public ResponseEntity<Category> add(@RequestBody Category category){
     Category obj = categoryService.save(category);
     return new ResponseEntity<>(obj, HttpStatus.OK);
  }
  
  @DeleteMapping(value="/{id}")
  public ResponseEntity<Category> deleteItem(@PathVariable Integer id) {
      Category obj = categoryService.findById(id);
      if(obj != null) {
          categoryService.delete(id);
      } else {
          return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
      }
      return new ResponseEntity<>(obj, HttpStatus.OK);
  }
  
  @PutMapping(value="/update")
  public ResponseEntity<Category> updateItem(@RequestBody Category category) {
      Category obj = categoryService.findById(category.getId_category());
      if(obj != null) {
          obj.setName(category.getName());
          categoryService.save(obj);
      } else {
          return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
      }
      return new ResponseEntity<>(obj, HttpStatus.OK);
  }
  
  @GetMapping("/list")
  public List<Category> getAllCategories() {
      return categoryService.findByAll();
  }
  
  @GetMapping("/list/{id}")
  public Category getCategoryById(@PathVariable Integer id) {
      return categoryService.findById(id);
  }
}
