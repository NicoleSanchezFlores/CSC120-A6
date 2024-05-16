import java.util.Hashtable;

// library, extending Building
public class Library extends Building {

  // hashtable to store titles and their availability
  private Hashtable<String, Boolean> collection;

  // constructor to create a new Library instance
  public Library(String name, String address, int nFloors) {
    // call the superclass constructor (Building)
    super(name, address, nFloors);
    // initialize the collection hashtable
    this.collection = new Hashtable<>();
  }

  // method to add a new title to the library collection
  public void addTitle(String title) {
    // check if the title is already in the collection
    if (collection.contains(title)) {
      // if title already exists, throw an exception
      throw new RuntimeException(title + " is already in the collection");
    }
    // add the title to the collection with availability status true (available)
    collection.put(title, true);
  }

  // method to remove a title from the library collection
  public String removeTitle(String title) {
    // check if the title exists in the collection
    if (!collection.contains(title)) {
      // if title doesn't exist, throw an exception
      throw new RuntimeException(title + " is not in the collection");
    }
    // remove the title from the collection and return it
    collection.remove(title);
    return title;
  }

  // method to put a title as checked out
  public void checkOut(String title) {
    collection.replace(title, true, false);
  }

  // method to mark a title as returned
  public void returnBook(String title) {
    collection.replace(title, false, true);
  }

  // method to check if the library contains a specific title
  public boolean containsTitle(String title) {
    return collection.containsKey(title);
  }

  // method to check if a title is available for checkout
  public boolean isAvailable(String title) {
    return collection.getOrDefault(title, false);
  }
}
