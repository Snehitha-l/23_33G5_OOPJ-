import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        // Calculate the discriminant D
        double D = b * b - 4 * a * c;
        
        // Display the discriminant
        System.out.println("Discriminant (D) = " + D);
        
        // Determine the nature of the roots based on the discriminant
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The equation has two real and distinct roots.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one real and repeated root.");
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("The equation has two complex roots.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        
        scanner.close();
    }
}

Output:
C:\Users\lakku\OneDrive\Documents\33g5>javac QuadraticEquation.java

C:\Users\lakku\OneDrive\Documents\33g5>java QuadraticEquation
Enter coefficient a: 1
Enter coefficient b: 2
Enter coefficient c: 3
Discriminant (D) = -8.0
The equation has two complex roots.
Root 1: -1.0 + 1.4142135623730951i
Root 2: -1.0 - 1.4142135623730951i
