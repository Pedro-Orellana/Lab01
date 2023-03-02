import java.util.Scanner;

/**
 * This class converts Philippine pesos to USD and viceversa
 * @author Matt Magnaye and Pedro Orellana
 * @since 03/02/2023
 */

public class Conversion {

    private static Scanner scanner;

    /**
     * Starting point of the program
     * 
     * @param args command line arguments 
     */
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Pedro and Matt's Currency Conversion Program!");
        int option = showMenu();
        displayConversion(option);
    }

    /**
     * This method displays a menu of options to the user, gets an input and returns
     * it to the main method so that it can be further processed
     * 
     * @return option selected by user
     */
    public static int showMenu() {
        System.out.println("----------------------------------");
        System.out.println("Option 1: Philippine Peso to American Dollar");
        System.out.println("Option 2: American Dollar to Philippine Peso");
        System.out.println("Option 3: Exit");
        System.out.print("Enter an option: ");
        int option = scanner.nextInt();
        return option;
    }

    /**
     * This method takes option previously selected by the user, then gets a
     * currency value (either in Pesos or USD) and calls the appropriate method to
     * make the conversion
     * 
     * @param option user-selected option to select what the program does. Valid
     *               options are 1, 2 or 3. Any other value makes the menu to
     *               reprint to the screen.
     */

    public static void displayConversion(int option) {
        double value, result;

        System.out.println();

        switch (option) {
            case 1:
                System.out.println("You chose to convert Philippine pesos to USD");
                System.out.print("Enter value in Philippine peso: ");
                value = scanner.nextDouble();
                result = pesoToDollar(value);
                System.out.println();
                System.out.printf("%.2f Philippine Peso = %.2f American Dollar\n", value, result);
                returnToMainMenuOrExit();
                break;

            case 2:
                System.out.println("You chose conversion from USD to Philippine pesos");
                System.out.print("Enter value in American Dollar: ");
                value = scanner.nextDouble();
                result = dollarToPeso(value);
                System.out.println();
                System.out.printf("%.2f American Dollar = %.2f Philippine Peso\n", value, result);
                returnToMainMenuOrExit();
                break;

            case 3:
                System.out.println("You chose option 3");
                System.out.println("Thank you for using our program, bye!");
                break;

            default:
                System.out.println("Incorrect option, please choose again");
                displayConversion(showMenu());

        }
    }

    /**
     * This method shows after a conversion has executed. It gives the user the
     * option to make another conversion or exit the program. Valid options are 1 and 2. Any other value will make the menu to reprint on the screen.
     */
    public static void returnToMainMenuOrExit() {
        System.out.println("----------------------------------");
        System.out.println("Choose an option:");
        System.out.println("1. Return to main menu");
        System.out.println("2. Exit");
        System.out.print("Enter choice: ");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                displayConversion(showMenu());
                break;

            case 2:
                System.out.println("Thank you for using our program, goodbye!");
                break;

            default:
                System.out.println("Invalid option");
                returnToMainMenuOrExit();
                break;

        }

    }

    /**
     * This method takes a value in Philippine pesos and returns its equivalent in USD
     * @param peso currency value in Philippine pesos
     * @return currency value converted to USD
     */

    public static double pesoToDollar(double peso) {
        return peso / 55.0; // assuming 1 USD = 55 PHP
    }

    /**
     * This method takes a value in USD and returns its equivalent in Philippine pesos
     * @param dollar currency value in USD
     * @return currency value converted to Philippine pesos
     */
    public static double dollarToPeso(double dollar) {
        return dollar * 55.0; // assuming 1 USD = 55 PHP
    }

}