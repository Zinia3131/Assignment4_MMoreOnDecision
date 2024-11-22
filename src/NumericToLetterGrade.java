import java.util.Scanner;

public class NumericToLetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric grade (0 to 4): ");
        double numericGrade = scanner.nextDouble();

        Grade2 grade = new Grade2(numericGrade);

        String letterGrade = grade.getLetterGrade();
        if (letterGrade.equals("Invalid grade")) {
            System.out.println("Invalid numeric grade entered.");
        } else {
            System.out.println("The closest letter grade is: " + letterGrade);
        }

        scanner.close();
    }
}
