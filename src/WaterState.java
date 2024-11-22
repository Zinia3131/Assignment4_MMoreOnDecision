import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature value and unit
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        // Determine the state of water
        String state;

        if (unit == 'C') {
            if (temperature <= 0) {
                state = "solid";
            } else if (temperature >= 100) {
                state = "gaseous";
            } else {
                state = "liquid";
            }
        } else if (unit == 'F') {
            if (temperature <= 32) {
                state = "solid";
            } else if (temperature >= 212) {
                state = "gaseous";
            } else {
                state = "liquid";
            }
        } else {
            state = "Invalid unit entered.";
        }

        // Output the state
        if (state.equals("Invalid unit entered.")) {
            System.out.println(state);
        } else {
            System.out.println("Water is " + state + " at the given temperature.");
        }
    }
}

