package com.futurecollars.taskTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Restaurant {

    public static void main(String[] args) {
        List<Ingredients> ingredientsOne = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO);
        List<Ingredients> ingredientsTwo = Arrays.asList(Ingredients.SALAMI, Ingredients.MOZZARELLA,
                Ingredients.TOMATO);
        List<Ingredients> ingredientsThree = Arrays.asList(Ingredients.CELERY, Ingredients.MOZZARELLA,
                Ingredients.TOMATO);
        List<Ingredients> ingredientsFour = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.MUSHROOMS);
        List<Ingredients> ingredientsFive = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.CELERY);
        List<Ingredients> ingredientsSix = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.PEPPER);
        List<Ingredients> ingredientsSeven = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.PEPPER, Ingredients.MUSHROOMS);
        List<Ingredients> ingredientsEight = Arrays.asList(Ingredients.SALAMI, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.PEPPER);
        List<Ingredients> ingredientsNine = Arrays.asList(Ingredients.SALAMI, Ingredients.CELERY,
                Ingredients.TOMATO);
        List<Ingredients> ingredientsTen = Arrays.asList(Ingredients.MUSHROOMS, Ingredients.MOZZARELLA,
                Ingredients.TOMATO);

        Pizza pizzaOne = new Pizza(ingredientsOne, true, 550, "pizzaOne");
        Pizza pizzaTwo = new Pizza(ingredientsTwo, false, 480, "pizzaTwo");
        Pizza pizzaThree = new Pizza(ingredientsThree, true, 750, "pizzaThree");
        Pizza pizzaFour = new Pizza(ingredientsFour, true, 620, "pizzaFour");
        Pizza pizzaFive = new Pizza(ingredientsFive, true, 370, "pizzaFive");
        Pizza pizzaSix = new Pizza(ingredientsSix, true, 920, "pizzaSix");
        Pizza pizzaSeven = new Pizza(ingredientsSeven, true, 800, "pizzaSeven");
        Pizza pizzaEight = new Pizza(ingredientsEight, false, 600, "pizzaEight");
        Pizza pizzaNine = new Pizza(ingredientsNine, false, 500, "pizzaNine");
        Pizza pizzaTen = new Pizza(ingredientsTen, true, 690, "pizzaTen");

        List<Pizza> menu = Arrays.asList(pizzaOne, pizzaTwo, pizzaThree, pizzaFour, pizzaFive, pizzaSix, pizzaSeven,
                pizzaEight, pizzaNine, pizzaTen);

        System.out.println("List of vegan pizzas:");
        printVegan(menu);
        System.out.println();
        System.out.println("List of pizzas contains celery:");
        printContainsCelery(menu);
        System.out.println();
        System.out.println("Is there a vegan pizza that contains tomato and pepper? " + checkIsVeganAndContainsTomatoAndPepper(menu));
        System.out.println();
        System.out.println("Whether all dishes contain mozzarella? " + doesEveryDishContainsMozzarella(menu));
        System.out.println();
        getPizzaWithHighestCalories(menu);
        System.out.println();
        getPizzaWithLowestCalories(menu);
    }

    public static void printVegan(List<Pizza> menu) {
        menu.stream()
                .filter(Pizza::isVegan)
                .map(Pizza::getName)
                .forEach(System.out::println);
    }

    public static void printContainsCelery(List<Pizza> menu) {
        menu.stream()
                .filter(pizza -> pizza.getIngredients().contains(Ingredients.CELERY))
                .map(Pizza::getName)
                .forEach(System.out::println);
    }

    public static boolean checkIsVeganAndContainsTomatoAndPepper(List<Pizza> menu) {
        return menu.stream().anyMatch(pizza -> pizza.isVegan() && pizza.getIngredients().contains(Ingredients.TOMATO) && pizza.getIngredients().contains(Ingredients.PEPPER));
    }

    public static boolean doesEveryDishContainsMozzarella(List<Pizza> menu) {
        return menu.stream().allMatch(pizza -> pizza.getIngredients().contains(Ingredients.MOZZARELLA));
    }

    public static void getPizzaWithHighestCalories(List<Pizza> menu) {
        Pizza maxCalories = menu
                .stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println("Pizza with highest calories is: " + maxCalories);
    }

    public static void getPizzaWithLowestCalories(List<Pizza> menu) {
        Pizza minCalories = menu
                .stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println("Pizza with lowest calories is: " + minCalories);
    }
}
