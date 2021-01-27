import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();  //metoda random zwraca zawsze doubla
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
