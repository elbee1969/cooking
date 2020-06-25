package fr.formation.recipesberthelot.dtos;

import fr.formation.recipesberthelot.entities.Difficulty;

public interface RecipeViewDto {
	
	
	Long getIdRecipe();
	
	String getRecipeName();
	
	int getPreparingTimeMinutes();
	
	int getCookingTimeMinutes();
	
	int getServings();
	
	Difficulty getDifficulty();
	
	String getDishImageUrl();
	

}
