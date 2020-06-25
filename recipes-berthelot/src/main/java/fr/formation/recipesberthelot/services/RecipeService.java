package fr.formation.recipesberthelot.services;

import fr.formation.recipesberthelot.dtos.RecipeViewDto;

public interface RecipeService {
	
	RecipeViewDto getOne(Long id);
	

	
}
