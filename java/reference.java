import java.util.Scanner;

public class reference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainChoice;

        System.out.println("Welcome to the Canteen!");
        System.out.println("Main Menu:");
        System.out.println("1. Cool Drinks");
        System.out.println("2. Food Items");
        System.out.print("Please enter your choice (1 or 2): ");
        mainChoice = scanner.nextInt();

        switch (mainChoice) {
            case 1:
                System.out.println("Cool Drinks Menu:");
                System.out.println("1. Cola");
                System.out.println("2. Lemonade");
                System.out.println("3. Orange Juice");
                System.out.print("Please enter your choice (1, 2, or 3): ");
                int drinkChoice = scanner.nextInt();
                switch (drinkChoice) {
                    case 1:
                        System.out.println("You have selected Cola.");
                        break;
                    case 2:
                        System.out.println("You have selected Lemonade.");
                        break;
                    case 3:
                        System.out.println("You have selected Orange Juice.");
                        break;
                    default:
                        System.out.println("Invalid choice for Cool Drinks.");
                        break;
                }
                break;
            case 2:
                System.out.println("Food Items Menu:");
                System.out.println("1. Sandwich");
                System.out.println("2. Pizza");
                System.out.println("3. Burger");
                System.out.print("Please enter your choice (1, 2, or 3): ");
                int foodChoice = scanner.nextInt();
                switch (foodChoice) {
                    case 1:
                        System.out.println("You have selected Sandwich.");
                        break;
                    case 2:
                        System.out.println("You have selected Pizza.");
                        break;
                    case 3:
                        System.out.println("You have selected Burger.");
                        break;
                    default:
                        System.out.println("Invalid choice for Food Items.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid main menu choice.");
                break;
        }

        scanner.close();
        System.out.println("Thank you for visiting the canteen!");
    }
}
