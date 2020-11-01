import java.util.Scanner;

public class Average {
    static Scanner sc = new Scanner(System.in);
    public static int subMarks;
    public static int totalMarks;
    public static float percentage;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks(out of 100) of subject " + (i + 1) + ": ");
            subMarks = sc.nextInt();
            totalMarks += subMarks;
        }

        percentage = (float) totalMarks / 5;

        if (percentage >= 80) {
            System.out.println("Your grade is O.");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Your grade is A");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Your grade is B");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Your grade is C");
        } else if (percentage >= 40 && percentage < 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is E");
        }

    }
}
