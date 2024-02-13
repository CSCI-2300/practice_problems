# Geometric Shapes

## Objective:

1. Using inheritance to define a class hierarchy
1. Applying polymorphism by overriding a method of a child class
1. Using command line arguments to pass information to a Java program

## Project Description:

You are tasked with implementing a simple shape hierarchy in Java. Each shape will have common attributes and behaviors, with specific shapes having additional attributes or behaviors. Your task is to create a class hierarchy for different shapes and a Driver class to interact with these shapes based on user input from the command line.

Shape Class Hierarchy:

```
                               +--------------+
                               |    Shape     |
                               +--------------+
                               |              |
                               +--------------+
                                      ^
                                      |
              +-----------------------+---------------------+
              |                       |                     |
              |                       |                     |
    +-------------------+   +-------------------+   +--------------+
    |     Rectangle     |   |     Triangle      |   |    Circle    |
    +-------------------+   +-------------------+   +--------------+
    |                   |   |                   |   |              |
    +-------------------+   +-------------------+   +--------------+

```

**Shape Class:**

*Attributes:*

1. protected String name: Represents the name of the shape.

*Methods:*

1. public double getArea(): calculates the area of the shape.
1. public double getPerimeter(): calculates the perimeter of the shape

**Rectangle Class (Subclass of Shape):**

*Attributes:*

1. protected double width: Represents the width of the rectangle.
1. protected double height: Represents the height of the rectangle.

*Methods:*

1. Overrides the getArea() method to calculate the area of the rectangle (width * height).
1. Overrides the getPerimeter() method to calculate the perimeter of a rectangle (2 * width + 2 * height)

**Circle Class (Subclass of Shape):**

*Attributes:*

1. protected double radius: Represents the radius of the circle.

*Methods:*

1. Overrides the getArea() method to calculate the area of the circle (π * radius^2).
1. Overrides the getPerimeter() method to calculate the perimeter of a circle (2π * radius).

**Triangle Class (subclass of Shape):**

*Attributes:*

Define your own attributes to represent a triangle

*Methods*

1. Overrides the getArea() method to calculate the area of the triangle (based on the triangle's attributes).
1. Overrides the getPerimeter() method to calculate the perimeter of the triangle (based on the triangle's attributes).

**Driver Class:**
Define the Driver class with the following static methods:

1. public static void printTotalArea(Shape []shapes): Prints the total area of all shapes passed to the method.
1. public static void printTotalPerimeter(Shape []shapes): Prints the total perimeter of all shapes passed to the method.
1. public static void main(String[] args): Instantiates specific Shape objects based on the command-line arguments and calls printTotalArea and printTotalPerimeter to print the total area and perimeter of all shapes. The command-line arguments determine the type of shape to create and any additional information needed to create it.

*Command-Line Arguments Format:*

1. rectangle NAME WIDTH HEIGHT - a rectangle with the given name, width, and height.
1. circle NAME RADIUS: - circle with the given name and radius.
1. Consider what command line arguments you would need to define a triangle.

Note, that the user should be able to create multiple shapes with command line arguments. For example, the following command line arguments would create 3 shapes: rectangle, circle, and another rectangle:
```
java Driver rectangle R1 5 10 circle C1 3 Rectangle R2 2 1
```
