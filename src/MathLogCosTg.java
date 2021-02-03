import java.util.Scanner;

public class MathLogCosTg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter minNumber: ");
        int minNumber = scanner.nextInt();

        System.out.println("Enter maxNumber: ");
        int maxNumber = scanner.nextInt();
        scanner.nextLine();

        do {
            if (maxNumber < minNumber) {
                System.out.println("Warning: maxNumber < minNumber. Please enter correct maxNumber:");
                maxNumber = scanner.nextInt();
                scanner.nextLine();
            } else if (maxNumber == minNumber) {
                System.out.println("Warning: maxNumber = minNumber. Please enter correct maxNumber:");
                maxNumber = scanner.nextInt();
                scanner.nextLine();
            } else {
                break;
            }
        } while (maxNumber <= minNumber);

        System.out.println("----------------");
        System.out.println("minNumber: " + minNumber);
        System.out.println("maxNumber: " + maxNumber);
        System.out.println();

        double a = (Math.random() * (maxNumber - minNumber) + minNumber);
        double b = (Math.random() * (maxNumber - minNumber) + minNumber);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();

        double logAB = Math.log(a) * Math.log(b);
        System.out.println("Log_ab: " + logAB);
        double cosA = Math.cos(a);
        System.out.println("Cosinus a: " + cosA);
        double tanB = Math.tan(b);
        System.out.println("Tangens b: " + tanB);
        System.out.println("-----------------------------");
    }
}