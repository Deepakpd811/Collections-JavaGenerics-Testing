package com.bridgelab.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

// Generic class for Meal 
public class Meal<T extends MealPlan> {

    List<T> listOfMeal = new ArrayList<>();

    // method to add meal in list
    public void addMeal(T mealItem) {
        listOfMeal.add(mealItem);
    }

    // method to display meal
    public void display() {
        for (T meal : listOfMeal) {
            System.out.println(meal);
        }
    }

}
