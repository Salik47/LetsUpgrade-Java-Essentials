import java.util.Scanner;

public class Avenger {
    Scanner sc = new Scanner(System.in);
    public String name, power, weapon, planet;
    public int age;
    public int[] avengers = new int[5];

    public void getDetails() {
        System.out.print("Enter the name: ");
        name = sc.nextLine();

        System.out.print("Enter the age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the power: ");
        power = sc.nextLine();

        System.out.print("Enter the weapon: ");
        weapon = sc.nextLine();

        System.out.print("Enter the planet: ");
        planet = sc.next();

        System.out.println();
    }

    public void displayDetails() {
        System.out.println("The name of the avenger is " + name);
        System.out.println("The age of the avenger is " + age);
        System.out.println("The power of the avenger is  " + power);
        System.out.println("The weapon of the avenger is " + weapon);
        System.out.println("The planet of the avenger is " + planet);
        System.out.println();
    }
}
