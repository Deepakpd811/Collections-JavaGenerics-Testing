package com.bridgelab.mealplangenerator;

import java.util.List;

public class MealPlanner {

    // method to generate a personalized meal plan dynamically.
    public static void displayAllMeal(List<? extends MealPlan> listofpersonalizedmeal) {
        for (MealPlan meal : listofpersonalizedmeal) {
            meal.displayMeal();
        }
    }

}
