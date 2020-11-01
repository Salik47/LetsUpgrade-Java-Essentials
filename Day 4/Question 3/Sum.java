import java.util.Scanner;

public class Sum {
    static Scanner sc = new Scanner(System.in);
    public static int[] numbers = new int[5];
    public static int number;
    public static int sum;

    public static void main(String[] args) {
        System.out.println("Enter any five numbers of your choice.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "number: ");
            number = sc.nextInt();
            sum += number;
        }

        System.out.println("The sum of all the numbers is " + sum);
    }
}
