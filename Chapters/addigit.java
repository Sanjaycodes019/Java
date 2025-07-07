import java.util.Scanner;

public class addigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // First, determine the number of digits
        int temp = num;
        int numDigits = 0;
        while (temp != 0) {
            numDigits++;
            temp /= 10;
        }

        int newNum = 0;
        int k = 0;

        // Use a for loop based on number of digits
        for (int j = 0; j < numDigits; j++) {
            int i = (num % 10 + 1) % 10; // Increment digit with wrap-around
            newNum += i * (int)Math.pow(10, k); // Reconstruct the new number
            num /= 10; // Remove the last digit
            k++;
        }

        System.out.println("The number after adding 1 to each digit is: " + newNum);
    }
}