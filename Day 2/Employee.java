public class Employee {
    public static String name = "Saurab";
    public static int age = 24;
    public static String city = "Chennai";

    public static void displayDetails() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My city is" + city); 
    }

    public static void main(String[] args) {
        displayDetails();
    }
}
