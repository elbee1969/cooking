package fr.formation.recipesberthelot.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import fr.formation.recipesberthelot.entities.Difficulty;

public class RecipeDto {
	
	
	private Long idRecipe;
	
	
	@NotBlank
	@Size(min = 3)
	private String recipeName;
	
	@NotNull
	@Min(value = 3)
	@Max(value = 120)
	private int preparingTimeMinutes;
	
	 @Min(value = 1)
	 @Max(value = 240)	
	 private int cookingTimeMinutes;

	 @NotNull
	 @Min(value = 1)
	 @Max(value = 10)	 
	 private int servings;

	 @NotNull	 
	 private Difficulty difficulty;

	 @NotNull
	 @Size(min = 7)
	 private String dishImageUrl;	 
	 
	public RecipeDto() {
		// TODO Auto-generated constructor stub
	}

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

}
