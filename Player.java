public class Player {

        //Instance variables.
        private int money;
        private int location;
        private String name;
        
    
        public Player() {
    
            money = 1000;
            name = "";
        }
    
        public void setMoney(int newMoney) {
    
            money = newMoney;
        }
    
        //Accessor method. Access to length.
        public int getMoney() {
    
            return money;
        }
    
        //Modifier method. Modifies width.
        public void setlocation(int newLocation) {
    
            location = newLocation;
        }
    
        //Accessor method. Access to width.
        public int getLocation() {
    
            return location;
        }
    
        public void setName(String newName) {
            
            name = newName;
        }
        
    
        public String getName() {
            return name;

        }
        
        public int tossDie(Die die) {
            int diceNumber = die.getRoll();
            System.out.println(getName() + " toss a die... Face is " + diceNumber);
            return diceNumber;
        }
    
    }
    
