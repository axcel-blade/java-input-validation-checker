/************************************************************************
 * Author - Srikanth Fernando                                           *
 * GitHub Username - axcel-blade                                        *
 * Title - Java Input Validation Checker                                *
 * Description - This Java code is for check if the user input is valid *
 * Created - 11/06/2024                                                 *
 * Last Modified - 11/06/2024                                           *
 ***********************************************************************/
import java.util.*;

public class InputValidationChecker {
    /***********************************************************************************************************************************
     * Method - IntegerValidationChecker                                                                                               *
     * Import - pPromptToUser (String)                                                                                                 *
     * Export - number (Integer)                                                                                                       *
     * Description - This function check the user input is valid or not. If it is valid it will return the value or else it loop until *
     *                  the enter valid integer                                                                                        *
     ***********************************************************************************************************************************/
    public static int IntegerValidationChecker(String pPromptToUser) {
        Scanner userInput = new Scanner(System.in);
        int number = 0;
        boolean isNotValid = true;

        do {
            try {
                System.out.print(pPromptToUser);
                number = userInput.nextInt();

                isNotValid = false;

            } catch (InputMismatchException e) {
                System.out.println("\nERROR: Please enter a number.\n");
                userInput.next(); // Clear the user input

            } catch (NoSuchElementException e) {
                System.out.println("\nERROR: Do not leave the field empty.\n");
                userInput.next(); // Clear the user input

            }

        } while (isNotValid);

        userInput.close();

        return number;

    }

}