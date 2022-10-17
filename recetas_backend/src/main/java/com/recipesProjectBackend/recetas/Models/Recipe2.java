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
@Entity(name="recipe2")
public class Recipe2 implements Serializable {
   @Id
   @Column(name="id_recipe2")
   private int id_recipe2;
   @Column(name="title")
   private String title;
   @Column(name="description")
   private String description;
   @Column(name="image")
   private String image;
   @Column(name="id_category")
   private int id_category;

    public Recipe2() {
    }

    public Recipe2(int id_recipe2, String title, String description, String image, int id_category) {
        this.id_recipe2 = id_recipe2;
        this.title = title;
        this.description = description;
        this.image = image;
        this.id_category = id_category;
    }

    public int getId_recipe2() {
        return id_recipe2;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_recipe2(int id_recipe2) {
        this.id_recipe2 = id_recipe2;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }
   
   
}
