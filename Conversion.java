import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu(scanner);
    }

    public static void showMenu(Scanner scanner) {
        System.out.println("Welcome to Pedro and Matt's Currency Conversion Program!");
        System.out.println("Option 1: Philippine Peso to American Dollar");
        System.out.println("Option 2: American Dollar to Philippine Peso");
        System.out.println("Option 3: Exit");
        System.out.print("Enter a option: ");
        int option = scanner.nextInt();
        displayOption(option, scanner);

    }
    public static int returnToMainMenuOrExit(Scanner scanner) {
        System.out.println("Choose an option:");
        System.out.println("1. Return to main menu");
        System.out.println("2. Exit");
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }
    public static double pesoToDollar(double peso) {
        return peso / 55.0; // assuming 1 USD = 55 PHP
    }

    public static double dollarToPeso(double dollar) {
        return dollar * 55.0; // assuming 1 USD = 55 PHP
    }

    public static void displayOption(int option, Scanner scanner) {
        double value, result;
        switch (option) {
            case 1:
            System.out.println("You chose option 1");
            System.out.print("Enter value in Philippine Peso: ");
            value = scanner.nextDouble();
            result = pesoToDollar(value);
            System.out.printf("%.2f Philippine Peso = %.2f American Dollar\n", value, result);
            option = returnToMainMenuOrExit(scanner);
            break;

            case 2:
            System.out.println("You chose option 2");
            System.out.print("Enter value in American Dollar: ");
            value = scanner.nextDouble();
            result = dollarToPeso(value);
            System.out.printf("%.2f American Dollar = %.2f Philippine Peso\n", value, result);
            option = returnToMainMenuOrExit(scanner);
            break;

            case 3:
            System.out.println("You chose option 3");
            System.out.println("Thank you for using our program, bye!");
            
            break;

        }
    }
}