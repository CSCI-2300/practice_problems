# Inventory Manager

## Objectives:

1. Reinforce Java coding style conventions
1. Implement user interaction in Java
1. Practice static methods

# Project Description:

You're developing an inventory management system for a retail store. Write a Java program named InventoryManager.java that:

1. Asks the user for the number of products in the inventory.
1. For each product, prompt the user to enter:
   1. Product name
   1. Quantity in stock
   1. Price per unit
1. Calculates and displays the total value of each product in stock (quantity * price per unit).
1. Calculates and displays the total value of the entire inventory.
1. If the total inventory value exceeds $1000, print "Inventory value is healthy!". Otherwise, print "Manage your inventory better!".

Include the following static methods in your code and use them to organize your program and reduce code duplication:

1. calculateProductValue: Returns the total value of a product in stock. Accepts quantity and price per unit as parameters.
1. printProductValue: Accepts the product name, quantity, price per unit, and total value as parameters. Prints out the details of each product.
