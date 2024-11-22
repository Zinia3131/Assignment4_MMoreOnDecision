import java.util.Scanner;

public class LetterGradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String inputGrade = scanner.nextLine();

        Grade grade = new Grade(inputGrade);

        double numericValue = grade.getNumericGrade();
        if (numericValue == -1) {
            System.out.println("Invalid grade entered.");
        } else {
            System.out.printf("The numeric value is: %.1f%n", numericValue);
        }

        scanner.close();
    }
}
