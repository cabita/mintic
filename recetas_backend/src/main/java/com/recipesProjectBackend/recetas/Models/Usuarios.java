package com.recipesProjectBackend.recetas.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;


@Table
@Entity(name="users")
public class Usuarios implements Serializable {
   @Id
   @Column(name="id")
   private int id;
   @Column(name="fullname")
   private String fullname;
   @Column(name="email")
   private String email;
   @Column(name="celular")
   private int celular;
   @Column(name="username")
   private String username;
   @Column(name="status")
   private int status;
   @Column(name="avatar")
   private String avatar;
   @Column(name="password")
   private String password;
   @Column(name="id_role")
   private int id_role;

    public Usuarios() {
    }

    public Usuarios(int id, String fullname, String email, int celular, String username, int status, String avatar, String password, int id_role) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.celular = celular;
        this.username = username;
        this.status = status;
        this.avatar = avatar;
        this.password = password;
        this.id_role = id_role;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public int getCelular() {
        return celular;
    }

    public String getUsername() {
        return username;
    }

    public int getStatus() {
        return status;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getPassword() {
        return password;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

   
   
   
    
}
