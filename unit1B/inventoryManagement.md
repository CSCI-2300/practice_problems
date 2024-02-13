# Inventory Management System

## Objective:

1. Practice writing object-oriented Java code
1. Write a Java program utlizing multipel files
1. Apply Java arrays and ArrayList to store a collection of objects

## Project Description:
In this assignment, you will create an inventory management system for a fictional store that needs to keep track of its products, including their names, quantities, prices, and other relevant information. You will design and implement classes to represent products, manage inventory, and perform various operations such as adding, updating, and deleting products from the inventory. All input will be handled through the terminal, and the program should provide a user-friendly interface for interaction.

### Core Classes:

**Product Class:**

*Attributes:*

1. ID (int): Unique identifier for each product.
1. Name (String): Name of the product.
1. Quantity (int): Available quantity of the product in stock.
1. Price (double): Price of the product.

*Methods:*

1. Constructor(s): Initialize the product with provided data.
1. Getters and setters: Access and modify product attributes.

**InventoryManager Class:**

*Attributes:*

1. Products (ArrayList<Product>): A collection of Product objects representing the inventory.

*Methods:*

1. public void addProduct(Product product): Add a new product to the inventory.
1. public void updateProduct(Product product): Update an existing product in the inventory.
1. public void deleteProduct(int productId): Delete a product from the inventory based on its ID.
1. public Product[] searchProduct(String keyword): Search for products by name. Returns all matches: if the keyword is a substring of the product name, it's a match.
1. public int checkStock(int productId): Check the available quantity of a product.
1. public void sellProduct(int productId, int quantity): Update the quantity of a sold product in the inventory.
1. public void restockProduct(int productId, int quantity): Increase the quantity of a product in the inventory.
1. public Product[] getInventory(): retrieve the collection of products in the inventory

**Driver Class:**

The Driver class serves as the entry point of the program and facilitates user interaction through the terminal. It contains the main method responsible for executing the inventory management functionalities and handling user input.

The main method presents the user with a menu of options, as shown in the example below:
```
Please select an action:
1. Add a new product
2. Update product details
3. Delete a product
4. Search for products
5. Check stock
6. Sell a product
7. Restock a product
8. Exit

Enter your choice (1-8): 2

Enter the ID of the product to update: 123
Enter the new quantity: 50
```
Based on the menu selection, the user is prompted to enter additional information. After entering the necessary information, user selected menu option is executed.

To organize your code, use a static method for printing the menu and getting user's choice. Feel free to add other static methods to the driver, to help implement user interaction.

### Testing:

Test the program with different scenarios using terminal input, including adding products, updating product details, deleting products, searching for products, selling products, restocking products, etc.
Consider edge cases such as empty inventory, invalid product IDs, negative quantities, etc.
