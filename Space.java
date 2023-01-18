/* Name: Kaleb Tessema
* Start Date: Jan 16 2023
* Due Date: Dec 23 2022
* Class: ICS4U1
* Instructor: E, Katsman
* Desc: An Space/Square class to be a parent to all other activities occuring
*/

public class Space {
    private int location;
    private String name;
  
    // Constructor
    public Space(int squareLocation, String squareName) {
      location = squareLocation;
      name = squareName;

    }
  
   
    public Space() {
      name = "";
      location = 0;

    }


    // Pre: Requires the amount of hunger that is being subtracted
    // Post: Returns nothing to main
    // Desc: Sets the hunger being subtracted
    public void setLocation(int newLocation) {
      location = newLocation;
    }
  
    // Pre: Requires no parameters
    // Post: Returns hunger being subtracted
    // Desc: Returns hunger being subtracted
    public int getLocation() {
      return location;
    }

  // Pre: Requires the newName as a parameter
  // Post: Returns nothing to main
  // Desc: Sets the name of the user
  public void setName(String newName) {
    name = newName;
  }

      // Pre: Requires no parameters
    // Post: Returns hunger being subtracted
    // Desc: Returns hunger being subtracted
    public String getName() {
      return name;
    }
  
  
  }