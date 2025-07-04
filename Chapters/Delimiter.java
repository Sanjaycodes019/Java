import java.util.Scanner;

public class Delimiter {
    public static void main(String[] args) {

        // Creating Scanner with a string as input source
        Scanner sc = new Scanner("CODE-QUOTIENT-23.85-BETTER-34");

        // Setting "-" as the delimiter (separator)
        sc.useDelimiter("\\s*-\\s*");

        // Reading values one by one using next() and nextFloat()/nextInt()
        System.out.println(sc.next());       // CODE
        System.out.println(sc.next());       // QUOTIENT
        System.out.println(sc.nextFloat());  // 23.85
        System.out.println(sc.next());       // BETTER
        System.out.println(sc.nextInt());    // 34

        // Closing scanner
        sc.close();
    }
}
