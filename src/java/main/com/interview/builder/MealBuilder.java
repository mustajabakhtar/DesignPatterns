/**
 * 
 */
package com.interview.builder;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class MealBuilder {

	/**
	 * 
	 */
	public MealBuilder() {
		// TODO Auto-generated constructor stub
	}

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new NonVegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
