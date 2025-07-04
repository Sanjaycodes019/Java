import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating Scanner object once

        // taking integer as input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        // taking float input
        System.out.print("Enter a float number: ");
        float f = sc.nextFloat();
        System.out.println("You entered: " + f);

        // taking double input
        System.out.print("Enter a double number: ");
        double d = sc.nextDouble();
        System.out.println("You entered: " + d);

        // taking boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        System.out.println("You answered: " + isStudent);

        // taking a single word string
        System.out.print("Enter your name (single word): ");
        String name = sc.next(); // reads till space
        System.out.println("Your name is: " + name);

        sc.nextLine(); // clearing leftover newline

        // taking a full line string
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine(); // reads the whole line
        System.out.println("Your full name is: " + fullName);

        // taking a character input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // takes first char of the input
        System.out.println("You entered: " + ch);

        // closing the scanner (good habit)
        sc.close();
    }
}
