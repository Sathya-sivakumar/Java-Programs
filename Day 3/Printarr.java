import java.util.Scanner;

public class Printarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // Read the size of the array

        int[] array = new int[n]; // Declare and create an array of size n

        // Read array elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("The elements in the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
