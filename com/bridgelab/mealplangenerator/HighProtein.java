package com.bridgelab.mealplangenerator;

// class Highprotein implement mealplan interface
public class HighProtein implements MealPlan {
    private String mealname;

    // constructor
    HighProtein(String mealname) {
        this.mealname = mealname;
    }

    @Override
    public void displayMeal() {
        System.out.println("High protein meal: " + mealname);

    }
}
