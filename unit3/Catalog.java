import java.util.ArrayList;

public class Catalog
{
   private ArrayList<CatalogItem> catalogItems;
   private int nextId;
   /**
    * Instantiate an empty list of catalog itemss
    */
   public Catalog()
   {
      catalogItems = new ArrayList<CatalogItem>();
      nextId = 0;
   }

   /**
    * Adds a book to the catalog
    */
   public String add(Book b)
   {
      nextId++;
      String bookId = String.valueOf(nextId);
      addBookWithId(b, bookId);
      return bookId;
   }


   /**
    * If the book with the specified id is in the catalog's book collection and is available for checkout, 
    * the Catalog class marks this book as unavailable and returns True (meaning, checkout was successful). 
    * Otherwise, the method returns false.
    */
   public boolean checkout(String id)
   {
      CatalogItem matchedItem = findItem(id);
      boolean retValue = false;

      // if the book is available, make it not available
      // checkout is successful
      if (matchedItem != null && matchedItem.isAvailable())
      {
         matchedItem.setUnavailable();
         retValue = true;
      }

      return retValue;
   }

   /**
    * If the book with the specified id is in the catalog's book collection and is currently checked out, 
    * the Catalog marks this book as available and returns true (meaning, the return was successful). 
    * Otherwise, the method returns false. 
    */
   public boolean checkin(String id)
   {
      CatalogItem matchedItem = findItem(id);
      boolean retValue = false;

      // if the book is found and is currently unavailable, mark it as available
      if (matchedItem != null && !matchedItem.isAvailable())
      {
         matchedItem.setAvailable();
         retValue = true;
      }

      return retValue;
   }

   /*
    * Searches the book catalog for books that match the searchTerm exactly (equals) in the 
    * Title, First Name, or Last name attributes of the Book class. Returns the ArrayList of 
    * String objects - ids of the items that matched the searchTerm
    **/
   public ArrayList<String> search(String searchTerm)
   {
      ArrayList<String> retValue = new ArrayList<String>();

      // go through every book int the catalog and check if it matches the searchTerm
      // look at title, author first name, and author last name 
      for (CatalogItem item: this.catalogItems)
      { 
         Book book = item.getBook();

         if (book.getTitle().equals(searchTerm) ||
             book.getAuthorFirstName().equals(searchTerm) ||
             book.getAuthorLastName().equals(searchTerm))
         {
             retValue.add(item.getId());
         }
      }

      return retValue;
   }

   public Book getBook(String id)
   {
      CatalogItem item = findItem(id);
      Book retValue = null;
      if (item != null)
      {
         retValue = item.getBook();
      }
      return retValue;
   }
   /*
    * If the book with the specified bookId is in the Catalog's book collection and is available for checkout, 
    * removes the book from the collection and returns true. Otherwise, returns false.
    **/
   public boolean remove(String id)
   {
      CatalogItem item = findItem(id);
      boolean retValue = false;

      if (item != null && item.isAvailable())
      {
         this.catalogItems.remove(item);
         retValue = true;
      }
      return retValue;
   }

   public String toString()
   {
      String retValue = shortFormat();
      return retValue;
   }

   private String shortFormat()
   {
      String retValue = "";
      for (CatalogItem item: catalogItems){
         retValue+=item.getId()+": "+item.getBook().getTitle()+"\n";
      }
      return retValue;
   }

   private void addBookWithId(Book b, String id)
   {
      CatalogItem item = new CatalogItem(b, id, true);
      catalogItems.add(item);
   }


   private CatalogItem findItem(String id)
   {
      CatalogItem matchedItem   = null;

      // find the book with the specified id
      for (CatalogItem item: this.catalogItems)
      {
         if (item.getId().equals(id))
         {
            matchedItem = item;
            break;
         }
      }
      return matchedItem;
   }


}
