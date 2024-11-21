
/*
  Name: Raeed
  Project: Chapter 6 Part 2
  Date: 11/9/24
  Date completed: 11/8/24
  Summary: Fishing class
 */
import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        // Declare initials
        Die fishDie = new Die(6); // Create a 6 sided die ready for rolling
        boolean stillPlaying = true; // Boolean to break loop
        int fishPoints = 0; // Keep track of points

        // Ask for permission to start
        System.out.print("You have a family of 4 to feed \nWould you like to start fishing? (y/any) ");
        Scanner keyboard = new Scanner(System.in); // See if they want to start
        String startPlay = keyboard.nextLine(); // Get the value

        if (!"y".equals(startPlay)) { // Exit if they don't want to play
            stillPlaying = false; // Exit the loop
        }
        /*
         * Name: Play Loop
         * Variable: stillPlaying
         * Purpose: Check if the user is still playing
         */
        while (stillPlaying) {
            fishDie.roll(); // Roll the die once
            // Switch statement to assign points
            switch (fishDie.getValue()) {
                case 1:
                    fishPoints += 20;
                    break;
                case 2:
                    fishPoints += 5;
                    break;
                case 3:
                    fishPoints += 10;
                    break;
                case 4:
                    fishPoints += 13;
                    break;
                case 5:
                    fishPoints += 50;
                case 6:
                    fishPoints -= 5;
            }
            String fishedItem = analyzeFishNumber(fishDie.getValue()); // Get some text value into here
            System.out.println("You got " + fishedItem); // Read out what the user received

            System.out.print("Play again? (y/any) "); // Ask if they wanna play again
            String playAgainAnswer = keyboard.nextLine(); // Grab the input
            if (!"y".equals(playAgainAnswer))
                stillPlaying = false; // Exit loop
        }
        System.out.println("You earned: $" + fishPoints); // Total earnings
        congratulateUser(fishPoints); // Congratulations code
    }

    /*
     * Name: analyzeFishNumber
     * Parameters: num
     * Purpose: Give text labels to numbers inputted
     */
    public static String analyzeFishNumber(int num) {
        // Read each number and return the text label for the item
        switch (num) {
            case 1:
                return "a huge fish";
            case 2:
                return "an old shoe";
            case 3:
                return "a little fish";
            case 4:
                return "a message in a bottle";
            case 5:
                return "a box of diamonds";
            case 6:
                return "an illegal fishing fine";
            default:
                break;
        }
        return "Error"; // Just in case to make sure at least something is returned
    }

    /*
     * Name: congratulateUser
     * Parameters: points
     * Purpose: Give congrats depending on point earnings
     */
    public static void congratulateUser(int points) {
        // Congratulating logic based on points
        if (points < 10) {
            System.out.println("Congratulations, on getting almost nothing and NO FOOD on the table tonight.");
        } else if (points < 20) {
            System.out.println("Congratulations, you probably get one sandwhich between your family.");
        } else if (points < 50) {
            System.out.println("Congratulations, two sandwhiches for your family of 4.");
        } else if (points < 100) {
            System.out.println("Congratulations, you can feed your family tonight (inflation).");
        } else if (points > 150) {
            System.out.println("Congratulations, thats a lot of money, you earned more than you spent");
        } else {
            System.out.println("Congratulations!");
        }
    }
}

/*
 * You have a family of 4 to feed
 * Would you like to start fishing? (y/any) y
 * You got an illegal fishing fine
 * Play again? (y/any) y
 * You got a little fish
 * Play again? (y/any) y
 * You got an illegal fishing fine
 * Play again? (y/any) y
 * You got a message in a bottle
 * Play again? (y/any) y
 * You got a little fish
 * Play again? (y/any) y
 * You got a message in a bottle
 * Play again? (y/any) y
 * You got an illegal fishing fine
 * Play again? (y/any) y
 * You got a box of diamonds
 * Play again? (y/any) y
 * You got an old shoe
 * Play again? (y/any) y
 * You got a little fish
 * Play again? (y/any) a
 * You earned: $91
 * Congratulations, you can feed your family tonight (inflation).
 */