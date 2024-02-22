# Library Simulation

## Objectives:

1. Using inheritance to define a class hierarcy
1. Applying polymorphism by overriding a method of a child clss
1. Using command line arguments to pass information to a Java program
1. Handling abnormal program execution
1. Reading from file
1. String manipulation

## Project Description

You are tasked with implementing a program for managing library rentals: books, movies, etc. Using your program, the user should be able to load a collection of library rentals into the program (from a data file), and then search the collection by keyword. Your program will present all results that match the given keyword. The two types of library rentals we want to support are: book and movie. The format of a data file is:
```
title, year, type (book or movie), <the rest of the data>
```

### Data Model

Your program will be handling various library items:

1. Book, defined by:
   1. title (String)
   1. year of release (integer)
   1. author's first name (String)
   1. author's last name (String)
   1. ISBN (String)
   1. publisher (String)
1. Movie, defined by:
   1. title (String)
   1. year of release (integer)
   1. producer's first name (String)
   1. producer's last name (String)
   1. rating (String): a rating specifies what audiences the movie is appropriate for. Some examples used in movie ratings are: G - general audience, PG - parental guidance, R - adult, etc

Notice that Book and Movie have some common information. This is a good opportunity to apply inheritance. You can place all common attributes into a parent class, LibraryItem, and different attributes into child classes: Book and Movie.

## Solution Approach

To implement this program we need to break it down into smaller pieces, and implement one piece at a time. This program consists of the following concerns:

1. Search through the collection of books and movies by keyword
1. Reading the collection of books and movies from a data file
1. Interacting with the user to get their input (keyword) and display the results

### Search the collection

To support searching of the library collection by keyword, we'll need to iterate through the collection of LibraryItem objects and determine if that LibraryItem object matches the keyword. Rather than retrieving various attributes of a Book and a Movie in our search method and comparing them to the keyword, we can delegate the decision of whether a given object matches the keyword to the LibraryItem class. To do this, we will include a: public boolean matches(String keyword) method in the LibraryItem class. This method will compare the given keyword to the String based attributes of the LibraryItem object and return true of there is a match and false otherwise. However, our Book and Movie classes have additional String attribues that LibraryItem does not have. Therefore, the Book and Movie classes should override the matches method to implement their own definition of 'matches. Here, we are taking advantage of <b>polymorphism</b> because while we are searching through a collection of LibraryItem's, these objects may have been instantiated as a Bookor a Movie, in which case, it will be the Book's or Movie's implementation of 'matches' that will be used.

An item is considered a match if any of the String attributes of that item contain the keyword as a substring.

### Read the collection from a data file

To support this feature, we can design a separate class, DataLoader, that has a static method for readhing the data from a given file and returning a collection of LibraryItem objects. The method may have the following signature:
```
public static ArrayList<LibraryItem> loadLibraryItems(String fileName) throws IOException
```

This method will parse the input file and instantiate the appropriate object: Book or Movie. An example input file is provided in this directory as input.txt. Since Book and Movie are both sub-classes of LibraryItem, they can be stored in an ArrayList of LibraryItem objects, once again taking advantage of polymorphism.

### Interacting with the user

To interact with the user, we can define another static method that presents the user with a list of options: (1) search the catalog, (2) exit, reads in user's choice, and executes that choice. When the user choses to search the catalog, we read the keyword from the user and call the method defined earlier to search the catalog by keyword. All resulting matches are then printed to the terminal.

### Putting it all together

To connect all the pieces, the main method calls the DataLoader's loadLibraryItems method to load the data from a file (which is passed as a command line argument), and then calls the user interaction method to let the user search through the catalog.
