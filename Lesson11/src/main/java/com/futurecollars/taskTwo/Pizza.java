package com.futurecollars.taskTwo;

import java.util.List;

public class Pizza {

    private final List<Ingredients> ingredients;
    private final boolean isVegan;
    private final Integer calories;
    private final String name;

    public Pizza(List<Ingredients> ingredients, boolean isVegan, Integer calories, String name) {
        this.ingredients = ingredients;
        this.isVegan = isVegan;
        this.calories = calories;
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public Integer getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
