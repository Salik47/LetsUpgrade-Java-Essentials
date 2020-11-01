public class OddValues {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25 };
        
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
