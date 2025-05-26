import java.util.Scanner;
/**
 * Main class to run the program.
 */
final class Main {
    /**
     * Private constructor to prevent instantiation.
     * @throws IllegalStateException Utility class.
     */
    private Main() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * The main method to run the program.
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        // Create a Scanner object to read input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the width of the rectangle: ");
            int width = scanner.nextInt();
            // Check if the width is a positive number
            System.out.print("Enter the length of the rectangle: ");
            int length = scanner.nextInt();
            // Check if the width and length are positive numbers
            if (width <= 0 || length <= 0) {
                System.out.println("Only positive number.");
                // Display the width and length of the rectangle
            } else if (width > length) {
                System.out.println("The width cannot be greater than length.");
            } else {
                // Assuming RecForm is a class that calculates
                // area and perimeter of a rectangle.
                RecForm rectangle = new RecForm(width, length);
                System.out.println("Width of the rectangle: "
                        + rectangle.getWidth() + " cm");
                // Display the length of the rectangle
                System.out.println("Length of the rectangle: "
                        + rectangle.getLength() + " cm");
                // Display the area and perimeter of the rectangle
                System.out.println("");
                // Display the area and perimeter of the rectangle
                System.out.println("The area of this rectangle is: ");
                System.out.println("Area of the rectangle: "
                        + rectangle.getArea() + " cm²");
                System.out.println("");
                // Display the perimeter of the rectangle
                System.out.println("The perimeter of this rectangle is: ");
                System.out.println("Perimeter of the rectangle: "
                        + rectangle.getPerimeter() + " cm");
            }
            // Display the width and length of the rectangle
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}
