package fr.formation.recipesberthelot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "recipes")
public class Recipe {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_recipe")
	 private Long idRecipe;

	 @Column(name = "recipe_name", length = 100, nullable = false)
	 private String recipeName;

	 @Column(name = "preparing_time_minutes", nullable = false)	 
	 private int preparingTimeMinutes;
	 
	 @Column(name = "coking_time_minutes", nullable = true)	 
	 private int cookingTimeMinutes;
	 
	 @Column(name = "servings", nullable = false)
	 private int servings;
	 
	 @Enumerated(EnumType.STRING)
	 @Column(name = "difficulty", length = 6, columnDefinition = "ENUM('Low', 'Medium', 'High')", nullable = false)
	 private Difficulty difficulty;

	 @Column(name = "dish_image_url", length = 2500, nullable = false)
	 private String dishImageUrl;

	public Long getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(Long idRecipe) {
		this.idRecipe = idRecipe;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public int getPreparingTimeMinutes() {
		return preparingTimeMinutes;
	}

	public void setPreparingTimeMinutes(int preparingTimeMinutes) {
		this.preparingTimeMinutes = preparingTimeMinutes;
	}

	public int getCookingTimeMinutes() {
		return cookingTimeMinutes;
	}

	public void setCookingTimeMinutes(int cookingTimeMinutes) {
		this.cookingTimeMinutes = cookingTimeMinutes;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public String getDishImageUrl() {
		return dishImageUrl;
	}

	public void setDishImageUrl(String dishImageUrl) {
		this.dishImageUrl = dishImageUrl;
	}

	public Recipe() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	 
	 

}
