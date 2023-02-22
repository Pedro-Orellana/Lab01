import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu(scanner);
    }

    public static void showMenu(Scanner scanner) {
        System.out.println("Welcome to our conversion program, please enter an option: ");

        System.out.println("Option 1: something");
        System.out.println("Option 2: something else");
        System.out.println("Option 3: exit");

        int option = scanner.nextInt();
        displayOption(option, scanner);

    }

    public static void displayOption(int option, Scanner scanner) {
        switch (option) {
            case 1:
            //This line was modified by Matt earlier today
            System.out.println("You chose option 12132");
            showMenu(scanner);
            break;
            case 2:
            System.out.println("You chose option 2");
            showMenu(scanner);
            break;
            case 3:
            System.out.println("You chose option 3");
            System.out.println("Thank you for using our program, bye!");
            
            break;

        }
    }
}