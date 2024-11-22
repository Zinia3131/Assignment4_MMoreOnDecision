import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largest = Math.max(num1, Math.max(num2, num3));

        System.out.println("The largest number is " + largest);
    }
}

