import java.util.Scanner;

public class Employee {
    static Scanner sc = new Scanner(System.in);
    public static String name, month;
    public static int date, year;
    public static float salary, annualSalary, tax;

    public static void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + (2020 - year));
        System.out.println("Annual Salary: " + (salary * 12));
        System.out.println("Tax: " + tax);
    }

    public static void main(String[] args) {
        System.out.print("Enter the employee name: ");
        name = sc.next();
        System.out.print("Enter the day of birth: ");
        date = sc.nextInt();
        System.out.print("Enter the month of birth: ");
        month = sc.next();
        System.out.print("Enter the year of birth: ");
        year = sc.nextInt();
        System.out.print("Enter the employee salaray: ");
        salary = sc.nextFloat();

        annualSalary = salary * 12;

        if (annualSalary >= 500000) {
            tax = 20 * annualSalary / 100;
        } else if (annualSalary >= 400000 && annualSalary < 500000) {
            tax = 15 * annualSalary / 100;
        } else if (annualSalary >= 300000 && annualSalary < 400000) {
            tax = 10 * annualSalary / 100;
        } else if (annualSalary >= 200000 && annualSalary < 300000) {
            tax = 5 * annualSalary / 100;
        } else {
            tax = 0;
        }

        displayDetails();
    }
}
