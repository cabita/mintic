package com.recipesProjectBackend.recetas.Controller;

import com.recipesProjectBackend.recetas.Models.Usuarios;
import com.recipesProjectBackend.recetas.Service.UsuariosService;
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
@RequestMapping("/usuarios")
public class UsuariosController {
  @Autowired
  private UsuariosService usuariosService;
  
  @PostMapping(value="/crear") 
  public ResponseEntity<Usuarios> add(@RequestBody Usuarios usuarios){
     Usuarios obj = usuariosService.save(usuarios);
     return new ResponseEntity<>(obj, HttpStatus.OK);
  }
  
  @DeleteMapping(value="/{id}")
  public ResponseEntity<Usuarios> deleteItem(@PathVariable Integer id) {
      Usuarios obj = usuariosService.findById(id);
      if(obj != null) {
          usuariosService.delete(id);
      } else {
          return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
      }
      return new ResponseEntity<>(obj, HttpStatus.OK);
  }
  
  @PutMapping(value="/update")
  public ResponseEntity<Usuarios> updateItem(@RequestBody Usuarios usuarios) {
      Usuarios obj = usuariosService.findById(usuarios.getId());
      if(obj != null) {
          obj.setFullName(usuarios.getFullName());
          usuariosService.save(obj);
      } else {
          return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
      }
      return new ResponseEntity<>(obj, HttpStatus.OK);
  }
  
  @GetMapping("/list")
  public List<Usuarios> getAllUsuarios() {
      return usuariosService.findByAll();
  }
  
  @GetMapping("/list/{id}")
  public Usuarios getUsuarioById(@PathVariable Integer id) {
      return usuariosService.findById(id);
  }
}
