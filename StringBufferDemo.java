import java.util.Scanner;

public class StringBufferDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer strBuffer = new StringBuffer();

        System.out.println("Enter the initial string: ");
        strBuffer.append(scanner.nextLine());

        System.out.println("Choose an operation:");
        System.out.println("1. Delete a substring");
        System.out.println("2. Remove a character at a specific position");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline character after nextInt()

        switch (choice) {
            case 1:
                System.out.println("Enter the starting index to delete:");
                int startIndex = scanner.nextInt();
                System.out.println("Enter the ending index to delete:");
                int endIndex = scanner.nextInt();
                strBuffer.delete(startIndex, endIndex);
                System.out.println("Updated string after deletion: " + strBuffer);
                break;
            
            case 2:
                System.out.println("Enter the position of the character to remove:");
                int position = scanner.nextInt();
                if (position >= 0 && position < strBuffer.length()) {
                    strBuffer.deleteCharAt(position);
                    System.out.println("Updated string after removing character: " + strBuffer);
                } else {
                    System.out.println("Invalid position.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

Output:
D:\33g5>javac StringBufferDemo.java

D:\33g5>java StringBufferDemo
Enter the initial string:
snehitha
Choose an operation:
1. Delete a substring
2. Remove a character at a specific position
2
Enter the position of the character to remove:
4
Updated string after removing character: snehtha
