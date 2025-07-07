import java.util.Scanner;

public class addDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int newNum = 0;
        int position = 1;
        int tempNumber = number; // To preserve the original number

        while (tempNumber != 0) {
            int digit = tempNumber % 10; // Extract the last digit
            digit = (digit + 1) % 10;    // Add 1 to the digit, wrap around if 9

            newNum = digit * position + newNum; // Append the new digit in correct position
            tempNumber /= 10; // Remove the last digit
            position *= 10; // Move to the next position
        }

        System.out.println("The number after adding 1 to each digit is: " + newNum);
    }
}