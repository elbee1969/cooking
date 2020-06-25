package fr.formation.recipesberthelot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

@Table(name = "steps")
@Entity
public class Step {
		
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_step")
	 private Long idStep;
	 
	 @ManyToOne
	 @JoinColumn(name = "id_recipe",
	 				referencedColumnName = "id_recipe",
	 				nullable = false,
	 				foreignKey = @ForeignKey(name = "fk_steps_recipes_idx"))	 
	 private Recipe recipe;
	 

	 @Column(name = "step_wording", length = 255, nullable = false)
	 private String stepWording;
	 
	 @Column(name = "step_order", nullable = false)
	 private int stepOrder;

	public Step() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdStep() {
		return idStep;
	}

	public void setIdStep(Long idStep) {
		this.idStep = idStep;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public String getStepWording() {
		return stepWording;
	}

	public void setStepWording(String stepWording) {
		this.stepWording = stepWording;
	}

	public int getStepOrder() {
		return stepOrder;
	}

	public void setStepOrder(int stepOrder) {
		this.stepOrder = stepOrder;
	}

}
