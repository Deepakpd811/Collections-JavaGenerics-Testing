package com.bridgelab.mealplangenerator;

// class Vegan implement mealplan interface
public class Vegan implements MealPlan {
    private String foodname;

    // constructor
    Vegan(String foodname) {
        this.foodname = foodname;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegan meal: " + foodname);
    }
    
}
