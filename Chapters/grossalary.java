import java.util.Scanner;

public class grossalary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Salary: ");
        double salary = sc.nextDouble();
        
        double hra = 0.1*salary;
        double da = 0.2*salary;

        double gs = salary + hra + da;

        System.out.println("The Gross Salary is: "+ gs);

    }
}