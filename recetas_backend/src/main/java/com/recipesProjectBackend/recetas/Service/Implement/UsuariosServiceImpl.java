package com.recipesProjectBackend.recetas.Service.Implement;

import com.recipesProjectBackend.recetas.Dao.UsuariosDao;
import com.recipesProjectBackend.recetas.Models.Usuarios;
import com.recipesProjectBackend.recetas.Service.UsuariosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    private UsuariosDao usuariosDao;

    @Override
    @Transactional(readOnly=false)
    public Usuarios save(Usuarios usuarios) {
        return usuariosDao.save(usuarios);
    }  
    
    @Override
    @Transactional(readOnly=true)
    public Usuarios findById(Integer id) {
       return usuariosDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
       usuariosDao.deleteById(id);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Usuarios> findByAll() {
        return (List<Usuarios>) usuariosDao.findAll();
    }
 
}


