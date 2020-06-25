package fr.formation.recipesberthelot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.formation.recipesberthelot.dtos.RecipeViewDto;
import fr.formation.recipesberthelot.services.RecipeService;


@RestController
@RequestMapping("/recipes")
public class RecipeController {
	
	
	private final RecipeService recipeService;
	
	protected RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}


	@GetMapping("/{id}")
	protected RecipeViewDto getOne(@PathVariable("id") Long id) {
	return recipeService.getOne(id);
	}
	
}
