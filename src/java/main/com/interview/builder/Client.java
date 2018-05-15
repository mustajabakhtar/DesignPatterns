/**
 * 
 */
package com.interview.builder;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Client {

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MealBuilder vegMealBuilder = new MealBuilder();
		Meal vegMeal = vegMealBuilder.prepareVegMeal();
		System.out.println("VEG MEAL");
		vegMeal.showItems();
		System.out.println("TOTAL COST:" + vegMeal.getCost());

		MealBuilder nonVegMealBuilder = new MealBuilder();
		Meal nonVegMeal = nonVegMealBuilder.prepareNonVegMeal();
		System.out.println("NON-VEG MEAL");
		nonVegMeal.showItems();
		System.out.println("TOTAL COST:" + nonVegMeal.getCost());

	}

}
