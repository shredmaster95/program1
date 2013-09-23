///////////////////////////////////////////////////////////////////////////////
//ALL STUDENTS COMPLETE THESE SECTIONS
//Title:            SheepMaster
//Files:            SheepMaster.java
//Semester:         CS302 Fall 2013
//
//Author:           Spencer Godfrey
//Email:            ssgodfrey@wisc.edu
//CS Login:         godfrey
//Lecturer's Name:  Debra Deppeler
//Lab Section:      Lab 301
//
//PAIR PROGRAMMERS COMPLETE THIS SECTION
//Pair Partner:     (name of your pair programming partner)
//Email:            (email address of your programming partner)
//CS Login:         (partner's login name)
//Lecturer's Name:  (name of your partner's lecturer)
//Lab Section:      (your partner's lab section number)
//
//STUDENTS WHO GET HELP FROM ANYONE OTHER THAN THEIR PARTNER
//Credits:          (list anyone who helped you write your program)
////////////////////////////80 columns wide //////////////////////////////////

import java.util.Scanner;

/**
 * (Write a succinct description of this class here. You should avoid
 * wordiness and redundancy. If necessary, additional paragraphs should
 * be preceded by <p>, the html tag for a new paragraph.)
 *
 * <p>Bugs: (a list of bugs and other problems)
 *
 * @author Spencer Godfrey
 */
public class SheepMaster
{
    /**
     * This method will print a string on the screen for a user to read.
     * @param args
     */
    public static void main( String[] args )
    {
        //TODO: This is a good place to declare constants and other variables 
        // that are used throughout your program here. Example:
        final int SHEEP_PURCHASE_COST = 25;
        final int DOG_PURCHASE_COST = 40;
        final int SHEEP_SELL_COST = 10;
        final int DOG_SELL_COST = 25;
        final int WOLF_REWARD = 10;
        final int SHEEP_SHEAR = 50;
        final int VICTORY_AMOUNT = 1500;
        final int INITIAL_COIN = 500;
        final int INITIAL_SHEEP = 1;
        final int INITIAL_DOGS = 0;
        final int MIN_WOLVES = 1;
        final int WOLF_EATS_SHEEP = 3;
        final int CYCLES_TO_MARKET = 3;
        
        int currentsheep
        int currentdogs
        int coinpurse
        int nightssurvived
        int sheeosurvivalrate
        int dogsurvivalrate
        int sheeptodogratio
        
        

        // Here, we create a Scanner attached to System.in. This should be the 
        // only Scanner created in the entire program.
        Scanner scnr = new Scanner( System.in );
        
        // TODO for Milestone 4: Create a Random object, for use in generating 
        // random numbers. The code will be similar to the scanner 
        // declaration above. This should be the only Random created in the 
        // entire program.
        
        System.out.println("Welcome to Happy Meadows! The world is your oyster!")  
        
        // Main Program Loop
        // TODO: You can wait on adding a loop condition until Milestone 4, 
        // since we do not cover loops in lecture until Week 3. Until then, 
        // it's ok if your program does one action, then quits.
        {
            System.out.println("*** Current Meadow Status ***";
            		+	"Number of Sheep: 1";
            		+ 	"Number of Guard Dogs: 0";
            		+ 	"Number of Doubloons: 500";
            		+	"Number of turns before market day: 3");
            		
            // Print Main Menu and Prompt
            // TODO for Milestone 1

            // Handle User's Selection
            // TODO for Milestone 2
            
            // Hint: You don't have to declare all of your variables at the top.
            // Sometimes it is beter to declare them in narrower scopes.
            // Variable used for storing what the user's main menu choice
            int userChoice = 0;
            
            // The main bulk of your code will go here -- code for handling 
            // market prices, statistics, buying sheep, buying dogs, etc.
            // TODO for Milestone 3
                
            // Check for Victory, print victory message if satisfied
            // TODO for Milestone 3
            
            System.out.println();
        } // Bottom of Main Program Loop
        
        // Print exit message
        // TODO for Milestone 1
        
    } // End of main method
} // End of SheepMaster class

// TODO: Remove all TODO comments prior to submission of your project
