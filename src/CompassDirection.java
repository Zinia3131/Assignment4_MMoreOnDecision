import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle (0 to 360): ");
        double angle = scanner.nextDouble();

        angle = angle % 360;
        if (angle < 0) {
            angle += 360;
        }

        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        double[] angles = {0, 45, 90, 135, 180, 225, 270, 315};

        String nearestDirection = "";
        double minDifference = Double.MAX_VALUE;

        for (int i = 0; i < directions.length; i++) {

            double difference = Math.abs(angle - angles[i]);
            if (difference > 180) {
                difference = 360 - difference;
            }

            if (difference < minDifference) {
                minDifference = difference;
                nearestDirection = directions[i];
            }
        }

        System.out.println("The nearest compass direction is: " + nearestDirection);

        scanner.close();
    }
}

