/*
* The "BFoot" program calculates a board foot
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-02
*/

import java.util.Scanner;

/**
* This is a program that calculates a board foot.
*/
final class BFoot {

    /**
    * One boardfoot.
    */
    public static final double ONE_BOARDFOOT = 144;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private BFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        final double length;        

        System.out.print("This program figures out the length of a wooden ");
        System.out.println("board that is 1 board foot in dimension. (1 ");
        System.out.println(" board foot is 144 inches³ of wood.)");

        // Block of code to try
        try {

                final Scanner userInput = new Scanner(System.in);

                // ask the user to input width
                System.out.print("\nEnter the board's width (inch)): ");

                // Stores float in width
                final float width = userInput.nextFloat();

                // asks the user to input height
                System.out.print("\nEnter the board's height (inch)): ");

                // stores float in height
                final float height = userInput.nextFloat();

                // calculates what they need for a boardfoot
                length = ONE_BOARDFOOT / (width * height);

                // Outputs something
                System.out.print("\nThe wood should be "
                    + length + " inch(es) long.");

        } catch (java.util.InputMismatchException errorCode) {
        // Block of code to handle errors
                System.out.print("\nYou have not entered a valid input.");
        }

        System.out.print("\nDone.\n");
    }
}
