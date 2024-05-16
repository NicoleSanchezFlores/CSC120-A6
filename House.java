import java.util.ArrayList;

// house class representing a residential building
public class House extends Building {

  // arraylist to store the names of residents
  private ArrayList<String> residents; 
  // boolean flag indicating whether the house has a dining room
  private boolean hasDiningRoom;

  // constructor for creating a new house instance
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    // call the constructor of the superclass (building)
    super(name, address, nFloors);
    // initialize residents list
    this.residents = new ArrayList<String>();
    // initialize hasDiningRoom flag
    this.hasDiningRoom = hasDiningRoom;
  }

  // accessor method to check if the house has a dining room
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  // accessor method to get the number of residents in the house
  public int nResidents() {
    return this.residents.size();
  }

  // method to add a new resident to the house
  public void moveIn(String name) {
    // check if the resident is already in the list
    if (this.residents.contains(name)) {
      // if resident already exists, throw an exception
      throw new RuntimeException(name + " is already a resident of " + this.name);
    }
    // if resident is not in the list, add them
    this.residents.add(name);
    // print a message indicating the resident has moved in
    System.out.println(name + " has just moved into " + this.name + "! Go say hello :-)");
  }

  // override toString method to provide a string representation of the house
  public String toString() {
    // get the string representation of the superclass (building)
    String description = super.toString();
    // add information about the number of residents
    description += " There are currently " + this.nResidents() + " people living in this house.";
    // add information about the dining room
    description += " This house ";
    if (this.hasDiningRoom) {
      description += "has";
    } else {
      description += "does not have";
    }
    description += " an active dining room.";
    // return the complete description
    return description;
  }

  // main method to test the house class
  // New main method to demonstrate the House class
public static void main(String[] args) {
  // Create a new House instance (Morrow)
  House morrow = new House("Morrow", "123 Main St", 2, true);
  
  // Add residents to the Morrow house
  morrow.moveIn("Alice");
  morrow.moveIn("Bob");
  morrow.moveIn("Charlie");
  
  // Print information about the Morrow house
  System.out.println("Details of Morrow House:");
  System.out.println(morrow);
  
  // Check if the Morrow house has a dining room
  if (morrow.hasDiningRoom()) {
      System.out.println("Morrow House has a dining room.");
  } else {
      System.out.println("Morrow House does not have a dining room.");
  }
  
  // Create another House instance (Sunset)
  House sunset = new House("Sunset", "456 Elm St", 3, false);
  
  // Add residents to the Sunset house
  sunset.moveIn("NIcole");
  sunset.moveIn("Lucy");
  
  // Print information about the Sunset house
  System.out.println("\nDetails of Sunset House:");
  System.out.println(sunset);
  
  // Check if the Sunset house has a dining room
  if (sunset.hasDiningRoom()) {
      System.out.println("Sunset House has a dining room.");
  } else {
      System.out.println("Sunset House does not have a dining room.");
  }
}


}
