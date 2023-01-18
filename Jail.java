    public class Jail extends Space {

        private int cost;
      
        // Pre: Requires no parameters
        // Post: Returns nothing to main
        // Desc: Constructor which initializes variables to the object in main
        public Jail() {
          super(6, "Jail");
          cost = 0;
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
    
    
    
    }
    
    
