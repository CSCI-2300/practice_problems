# Recipe Organizer

## Objective:

1. Practice user interaction in Java
1. Apply Java coding style conventions
1. Reinforce static method usage

## Project Description:

You're creating a recipe organizer application. Write a Java program named RecipeOrganizer.java that:

1. Asks the user for the number of recipes to input.
1. For each recipe, prompt the user to enter:
   1. Recipe name
   1. Number of ingredients
   1. For each ingredient: name and quantity
1. Calculates and displays the total number of ingredients for each recipe.
1. Calculates and displays the total number of ingredients for all recipes combined.
1. If the total number of ingredients is more than 10, print "You have a variety of recipes!". Otherwise, print "Add more recipes!".

Include the following static methods in your code and use them to organize your program and reduce code duplication:

1. calculateTotalIngredients: Returns the total number of ingredients for a recipe. Accepts an array of ingredient quantities as a parameter.
1. printRecipeDetails: Accepts the recipe name, number of ingredients, and total ingredients as parameters. Prints out the details of each recipe.
