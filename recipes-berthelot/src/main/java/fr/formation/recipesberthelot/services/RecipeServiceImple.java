package fr.formation.recipesberthelot.services;

import org.springframework.stereotype.Service;

import fr.formation.recipesberthelot.dtos.RecipeViewDto;
import fr.formation.recipesberthelot.repositories.RecipeRepository;

@Service
public class RecipeServiceImple implements RecipeService {
	
	private final RecipeRepository recipeRepo;

	protected RecipeServiceImple (RecipeRepository recipeRepo) {
		this.recipeRepo = recipeRepo;
	}


@Override
    public RecipeViewDto getOne(Long id) {
	return recipeRepo.getById(id);
    }



}
