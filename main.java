
/**
* main
*/
import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;

        System.out.println("\nWelcome to the Medical Monopoly");
        // Do while loop until exit condition
        do {

            // Menu options for what user would like to do for the rectangle
            System.out.print("\n----------------------------------------");
            System.out.print("\n                  Menu                  ");
            System.out.print("\n----------------------------------------\n");

            System.out.print("\n<<          1 - Play Monopoly         >>");
            System.out.print("\n<<             2 - Rules              >>");
            System.out.print("\n<<          3 - Print to File         >>");
            System.out.print("\n<<              0 - Exit              >>");

            System.out.print("\n\nPlease enter one of the menu options above: ");
            menu = input.nextInt();

            // If 1 call upon length method
            if (menu == 1) {
                System.out.println("\n\n---------------------------------------------------\n\n");
                game();
            }
            // If 2 call upon width method
            else if (menu == 2) {
                System.out.println("\n\n---------------------------------------------------\n\n");
                rules();
            }
            // If 3 call upon startingCoordinates method
            else if (menu == 3) {
                System.out.println("\n\n---------------------------------------------------\n\n");
                printToFile();
            } else {
                // While loop for menu invalid input
                while (menu < 0 || menu > 3) {
                    System.out.print("Invalid input! \nPlease input one of the menu selection: ");
                    menu = input.nextInt();

                }

            }
            // Exit condition
        } while (menu != 0);
        System.out.println("Goodbye!");
    }

    // Length Method
    public static void game() {
        Player[] playerLists = new Player[8];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        monopolyBoard();
        System.out.println("How many absolute/total players?");
        int players = input.nextInt();
        while (players < 2 || players > 8) {
            System.out.println("Must have somewhere in the range of 2 and 8 players. Please try again.");
            players = input.nextInt();
        }
        System.out.println("How numerous human players?");
        int human = input.nextInt();
        while (human < 1 || human > players) {
            if (human < 1) {
                System.out.println("Must have minimum one human player. Kindly try again.");
            }
            if (human > players)
                System.out.println("Cannot have more human players than absolute/total players. Kindly try again.");
            human = input.nextInt();
        }
        int[] order = new int[players];
        for (int i = 0; i < human; i++) {
            System.out.println("Player " + (i + 1) + " name?");
            playerLists[i] = new Player();
        }
        for (int i = human; i < players; i++)
            state.players.add(new CPUPlayer(i - humans));

    }

    // Length Method
    public static void rules() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

    }

    // Length Method
    public static void printToFile() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

    }

    public static void monopolyBoard() {
                // String[][] board = new String[][] {
                //         { "GO",
                //                 "Massachusetts General Hospital",
                //                 "Johns Hopkins Hospital",
                //                 "Singapore General Hospital",
                //                 "Jail",
                //                 "Tokyo Medical and Dental University Hospital",
                //                 "Charité - Universitätsmedizin Berlin",
                //                 "Bumrungrad International Hospital",
                //                 "The Prince Charles Hospital",
                //                 "Free Parking",
                //                 "Toronto General Hospital",
                //                 "University College London Hospitals",
                //                 "Leiden University Medical Center",
                //                 "Sheba Medical Center",
                //                 "Go to Jail",
                //                 "University of Michigan Hospitals and Health Centers",
                //                 "Karolinska University Hospital",
                //                 "University of Hong Kong - Queen Mary Hospital",
                //                 "University of Zurich Hospital",
                //                 "University of Sao Paulo Hospital"
                //         },
                //         { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}
                // };
                // for (int i = 0; i < board.length; i++) {
                //         for (int j = 0; j < board[i].length; j++) {
                //             System.out.print(board[i][j] + " ");
                //         }
                //         System.out.println();
                //     }
                        String[][] board = new String[][]{
                            {"□", "□", "□", "□", "□", "□"},
                            {"□"," "," "," "," ","□" },
                            {"□"," "," "," "," ","□"},
                            {"□", " ", " ", " "," ", "□" },
                            {"□", " ", " ", " "," ", "□" },
                            {"□", "□", "□", "□", "□","□" }
                        };
                        for (int i = 0; i < board.length; i++) {
                            for (int j = 0; j < board[i].length; j++) {
                                System.out.print(board[i][j] + " ");
                            }
                            System.out.println();
                        }


                        String square1 = board[0][0];
                        String square2 = board[0][1];
                        String square3 = board[0][2];
                        String square4 = board[0][3];
                        String square5 = board[0][4];
                        String square6 = board[0][5];
                        String square7 = board[1][5];
                        String square8 = board[2][5];
                        String square9 = board[3][5];
                        String square10 = board[4][5];
                        String square11 = board[5][5];
                        String square12 = board[5][4];
                        String square13 = board[5][3];
                        String square14 = board[5][2];
                        String square15 = board[5][1];
                        String square16 = board[5][0];
                        String square17 = board[4][0];
                        String square18 = board[3][0];
                        String square19 = board[2][0];
                        String square20 = board[1][0];


                 // Intializes the 3 shows
    Property[] propertyList = new Property[14];
    for (int i = 0; i < propertyList.length; i++) {
        propertyList[i] = new Property();
    }
    
    square1 = propertyList[1];


                

        }
    

    }