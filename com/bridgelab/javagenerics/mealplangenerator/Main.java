package com.bridgelab.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vegetarian vegetarianfood = new Vegetarian("Milk");
        Vegan veganfood = new Vegan("Soyabean");
        Keto ketofood = new Keto("salad");
        HighProtein highproteinfood = new HighProtein("Chicken breast");

        // store all vegetarianMealPlan
        Meal<Vegetarian> vegetarianMealPlan = new Meal<>();
        vegetarianMealPlan.addMeal(vegetarianfood);

        // store all veganMealPlan
        Meal<Vegan> veganMealPlan = new Meal<>();
        veganMealPlan.addMeal(veganfood);

        // store all ketoMealPlan
        Meal<Keto> ketoMealPlan = new Meal<>();
        ketoMealPlan.addMeal(ketofood);

        // store all highProteinMealPlan
        Meal<HighProtein> highProteinMealPlan = new Meal<>();
        highProteinMealPlan.addMeal(highproteinfood);

        // use generic method to add random personlized meal
        List<MealPlan> personlizedPlan = new ArrayList<>();

        personlizedPlan.add(highproteinfood);
        personlizedPlan.add(ketofood);
        personlizedPlan.add(veganfood);
        System.out.println("\nlist of personlized meal");
        MealPlanner.displayAllMeal(personlizedPlan);

    }
}
