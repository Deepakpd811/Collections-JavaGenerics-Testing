package com.bridgelab.mealplangenerator;

// class Vegetarian implement mealplan interface
public class Vegetarian implements MealPlan{
    private String mealname;

    Vegetarian(String mealname) {
        this.mealname = mealname;
    }

    @Override
    public void displayMeal() {
       System.out.println("Vegetatian meal: " + mealname);
        
    }
}
