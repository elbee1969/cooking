package fr.formation.recipesberthelot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.formation.recipesberthelot.dtos.RecipeViewDto;
import fr.formation.recipesberthelot.entities.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
	
	RecipeViewDto getById(Long id);

}
