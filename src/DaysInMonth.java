import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int monthNumber = scanner.nextInt();

        Month month = new Month(monthNumber);
        int days = month.getLength();

        if (days == -1) {
            System.out.println("Invalid month.");
        } else {
            System.out.println(days + " days");
        }
    }
}
