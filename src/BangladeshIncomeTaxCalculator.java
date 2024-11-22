import java.util.Scanner;

public class BangladeshIncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user details
        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        // Determine tax-free income threshold
        double taxFreeThreshold = (gender == 'F' || age > 65) ? 400000 : 350000;

        // Calculate the income tax
        double tax = calculateIncomeTax(income, taxFreeThreshold);

        // Display the result
        System.out.printf("Your income tax is: BDT %.2f%n", tax);

        scanner.close();
    }

    /**
     * Calculate income tax based on Bangladesh National Budget 2023-24
     *
     * @param income           The total income.
     * @param taxFreeThreshold The tax-free threshold for the individual.
     * @return The calculated income tax.
     */
    public static double calculateIncomeTax(double income, double taxFreeThreshold) {
        double tax = 0.0;

        // Income brackets and rates
        double[] brackets = {450000, 750000, 1150000, 1650000};
        double[] rates = {0.05, 0.10, 0.15, 0.20, 0.25};

        // Adjust income for tax-free threshold
        if (income <= taxFreeThreshold) {
            return 0.0; // No tax if income is below the threshold
        }
        income -= taxFreeThreshold;

        // Calculate tax for each bracket
        for (int i = 0; i < brackets.length; i++) {
            if (income > brackets[i] - taxFreeThreshold) {
                tax += (brackets[i] - taxFreeThreshold) * rates[i];
                income -= (brackets[i] - taxFreeThreshold);
                taxFreeThreshold = brackets[i];
            } else {
                tax += income * rates[i];
                return tax;
            }
        }

        // Tax for income above the last bracket
        tax += income * rates[rates.length - 1];

        return tax;
    }
}

