import java.util.*;
public class SimpleStartupTestDrive{
    
    public static void main(String[] args) {
        int numofGuesses = 0;    //Initialize a int value to track the user Guesses
        SimpleStartup dot = new SimpleStartup(); //Creates a new SimpleStarup object and assigned it to the reference varible dot
        Random randomcells = new Random(); //Creates a Random object and assign it to the Random cells refernce variable
        int startingCellPos1 = randomcells.nextInt(0,4); /* Uses the randomcells reference variable to access the next int method that 
                                                                        provides a random number between 0-4 specified by the argument.
                                                                        Assigns the value to startingCellPos1
                                                                        */
       
        ArrayList<String> locations = new ArrayList<String>(); //Creates an arrayList object and assigns it to the locations reference variable
        locations.add(String.valueOf(startingCellPos1));        /*use the reference variable to access the add method from the ArrayList
                                                                Assign the Startingcellpos1 to the locations reference variable object and cast the value to a string 


                                                                */
        locations.add(String.valueOf(startingCellPos1+1));
        locations.add(String.valueOf(startingCellPos1+2));

        dot.setLocationCells(locations); //Assign the 3 locations value as an argument to the setlocationscell parameter
        //System.out.println(locations);
        boolean IsAlive = true; //initialize a boolean value to start the game

        while (IsAlive) {   //Keeps game alive while the boolean value is true
            Scanner stdin = new Scanner(System.in);  //Create a scanner object to read inputs from the user
            System.out.println("Enter your guess: "); //Prompts the user
            String userGuess = (String.valueOf(stdin.nextInt())); //Converts user value to a string and assign it to user guess
            String result = dot.checkYourself(userGuess);  //invoke the checkyourself method with userguess as an argumentr
            numofGuesses++;  //increment the number of guesses
            if (result.equals("kill")) {  // check to see if the result value returned by the checkyourself method is "Kill"
                IsAlive = false;   //ends the game if the user guess returns kill
                System.out.println("Number of Guesses: " +  numofGuesses);
            }
           
        }
    

    }
}