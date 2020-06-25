package fr.formation.recipesberthelot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(name = "ingredients")
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingredient")
    private Long idIngredient;
    
    @ManyToOne
    @JoinColumn(name = "id_recipe",
    			referencedColumnName = "id_recipe",
    			nullable = false,
    			foreignKey = @ForeignKey(name = "fk_ingredients_recipes_idx"))
    private Recipe recipe;
    

    @Column(name = "ingredient_wording", length= 255, nullable = false)
    private String ingredientWording;
    
    
    
    public Ingredient () {
    }



	public Long getIdIngredient() {
		return idIngredient;
	}



	public void setIdIngredient(Long idIngredient) {
		this.idIngredient = idIngredient;
	}



	public Recipe getRecipe() {
		return recipe;
	}



	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}



	public String getIngredientWording() {
		return ingredientWording;
	}



	public void setIngredientWording(String ingredientWording) {
		this.ingredientWording = ingredientWording;
	}
    
} 
