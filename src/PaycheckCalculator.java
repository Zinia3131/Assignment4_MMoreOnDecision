import java.util.Scanner;
public class PaycheckCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Employee name, hourly wage, and hours worked
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = scanner.nextDouble();

        // Create Paycheck object and calculate pay
        Paycheck paycheck = new Paycheck(name, hourlyWage, hoursWorked);

        // Print the paycheck
        paycheck.printPaycheck();
    }
}

