package com.bridgelab.mealplangenerator;

// class Keto implement mealplan interface
public class Keto implements MealPlan {
    private String mealname;

    // constructor
    Keto(String mealname) {
        this.mealname = mealname;
    }

    @Override
    public void displayMeal() {
        System.out.println("Keto meal: " + mealname);

    }
}
