abstract class Employee {
    String name;
    int baseSalary;

    Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract void calculateBonus();

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: RS " + baseSalary);
    }
}

class Manager extends Employee {
    Manager(String name, int baseSalary) {
        super(name, baseSalary);
    }

    void calculateBonus() {
        double bonus = baseSalary * 0.40;
        displayInfo();
        System.out.printf("Manager Bonus: RS %.2f\n", bonus);
    }
}

class Developer extends Employee {
    Developer(String name, int baseSalary) {
        super(name, baseSalary);
    }

    void calculateBonus() {
        double bonus = baseSalary * 0.25;
        displayInfo();
        System.out.printf("Developer Bonus: RS %.2f\n", bonus);
    }
}

class Intern extends Employee{
    Intern(String name, int baseSalary){
        super(name, baseSalary);
    }
    
    void calculateBonus(){
        double bonus = baseSalary * 0.1;
        displayInfo();
       System.out.printf("Intern Bonus: RS %.2f\n",bonus);
    }
}

// public class EmployeeBonus {
//     public static void main(String[] args) {
//         Manager m = new Manager("Sanjay", 50000);
//         Developer d = new Developer("Mochu", 40000);
//         Intern i = new Intern("Sneha", 45000);

//         System.out.println("== Manager Details ==");
//         m.calculateBonus();

//         System.out.println("\n== Developer Details ==");
//         d.calculateBonus();

//         System.out.println("\n==Intern Details==");
//         i.calculateBonus();
//     }
// }

public class EmployeeBonus {
    public static void main(String[] args) {
        // Creating an array of Employee references
        Employee[] employees = new Employee[3];

        // Storing different types of employees
        employees[0] = new Manager("Sanjay", 50000);
        employees[1] = new Developer("Mochu", 40000);
        employees[2] = new Intern("Simone", 450000);

        // Looping through the array and calculating bonus for each
        for (Employee e : employees) {
            System.out.println("\n== " + e.getClass().getSimpleName() + " Details ==");
            e.calculateBonus();
        }
    }
}
