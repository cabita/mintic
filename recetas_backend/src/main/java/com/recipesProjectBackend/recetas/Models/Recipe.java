package com.recipesProjectBackend.recetas.Models;

import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Column;
import javax.persistence.Id;


public class Recipe implements Serializable {
   @Id
   @Column(name="id_recipe")
   private int id_recipe;
   @Column(name="name")
   private String name;
   @Column(name="date_published")
   private String date_published;
   @Column(name="description")
   private String description;
   @Column(name="prep_time")
   private char prep_time;
   @Column(name="cook_time")
   private char cook_time;
   @Column(name="totalTime")
   private char totalTime;
   @Column(name="keywords")
   private String keywords;
   @Column(name="recipeYield")
   private String recipeYield;
   @Column(name="recipeCuisine")
   private String recipeCuisine;
   @Column(name="calories")
   private String calories;
   @Column(name="protein")
   private String protein;
   @Column(name="fat")
   private String fat;
   @Column(name="carbs")
   private String carbs;
   
}

