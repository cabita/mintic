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
@Entity(name="category")
public class Category implements Serializable{
   @Id
   @Column(name="id_category")
   private int id_category;
   @Column(name="name")
   private String name; 

    public Category() {
    }

    public Category(int id_category, String name) {
        this.id_category = id_category;
        this.name = name;
    }

    public int getId_category() {
        return id_category;
    }

    public String getName() {
        return name;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public void setName(String name) {
        this.name = name;
    }
   
   
}
