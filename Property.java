/* Name: Kaleb Tessema
* Start Date: Jan 16 2023
* Due Date: Jan 23 2023
* Class: ICS4U1
* Instructor: E, Katsman
* Desc: A class dedicated to controlling how Properties run
*/

public class Property extends Space {

    private int location; 
    private int cost;
    private String name;
    private int rentCost;
    private int owner;
  
    // Pre: Requires no parameters
    // Post: Returns nothing to main
    // Desc: Constructor which initializes variables to the object in main
    public Property() {
      super();
      location = 0;
      name = "";
      cost = 0;
      owner = -1;
    }

  // Pre: Requires the cost of the rides
  // Post: Returns nothing to main
  // Desc: Sets the cost of the ride
  public void setCost(int newCost) {
    cost = newCost;
  }

  // Pre: Requires no parameters
  // Post: Returns cost of rides
  // Desc: Returns cost of rides
  public int getCost() {
    return cost;
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
  // Post: Returns the user's name
  // Desc: Returns the user's name
  public String getName() {
    return name;
  }

    // Pre: Requires the amount of hunger that is being subtracted
    // Post: Returns nothing to main
    // Desc: Sets the hunger being subtracted
    public void setRentCost(int newRentCost) {
      rentCost = newRentCost;
    }
  
    // Pre: Requires no parameters
    // Post: Returns hunger being subtracted
    // Desc: Returns hunger being subtracted
    public int getRentCost() {
      return rentCost;
    }

    // public void doAction(Player player) {
    //   if(owner < 0){
    //     Util.print(player, player.getName() + ", do you want to buy " + getName() + "?");
    //     Random rand = new Random();
    //     if(rand.nextBoolean()){
    //       Util.print(player, player.getName() + " buy " + getName() + " for " + price);
    //       owner = player.getID();
    //       player.getMoney().substractMoney(price);
    //     }else{
    //       Util.print(player, player.getName() + " don't want to buy " + getName());
    //     }
    //   }else{
    //     if(owner != player.getID()){
    //       int lost = price * 70 / 100;
    //       Util.print(player, player.getName() + " lost " + lost + " money to " + board.getPlayer(owner).getName());
    //       player.getMoney().substractMoney(lost);
    //       board.getPlayer(owner).getMoney().addMoney(lost);
    //     }
    //   }
    // }


}