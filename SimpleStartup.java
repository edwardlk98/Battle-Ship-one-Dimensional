import java.util.ArrayList;
/*
 * Simulates a Simple 1 dimensional Battleship game.
 * Takes a input of an array and have the user guess the location of the Array to sink the ship
 */
public class SimpleStartup {
    private ArrayList<String> locationCells; //Initialize the locationsCells to an ArrayList of object String;
    public void setLocationCells(ArrayList<String> locs){ //Method takes an Arraylist of strings and assign it to the Location cell instance variable
        locationCells = locs;
    }
    public String checkYourself(String userInput){   //Method Checks to see if the input provoded by the user is in The ArrayList
        String result = "miss";   //Initialize the result of the method to miss
        int index = locationCells.indexOf(userInput); /*Checks to see if the user input exist in the Arraylist by checking the index of the value.
                                                        Returns -1 if the value index does not exist
                                                        */

        if (index >= 0){  //Checks to see if the value index exist
            locationCells.remove(index);    //if it does remove the index from the ArrayList
            if (locationCells.isEmpty()){    //After  removing check to see if the ArrayList is empty
                result = "kill";//If its emptpy the result is kill and the ship has sunked
                System.out.println("Kill");
            }

                else{
                    result = "hit";   //If its not empty the result is a hit 
                    System.out.println("Hit!");
                }
            }
            if (index < 0) {// if the index is less than 0 the userinput value does not have an index in the Array so its a miss.
                System.out.println("miss");
            }
        return result; //Returns a String  back to the caller
    }
}
