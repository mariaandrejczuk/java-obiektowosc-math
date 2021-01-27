import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int size = scanner.nextInt();

        NumberRepo numberRepo = new NumberRepo(size);

        double[] numbers = new double[size];
        numberRepo.generateValues();
        numberRepo.displayAll();

        double min = numberRepo.findMin();
        System.out.println("Min value: "+min);
    }
}
