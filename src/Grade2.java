import java.util.Scanner;

class Grade2 {
    private double numericGrade;

    // Constructor
    public Grade2(double numericGrade) {
        this.numericGrade = numericGrade;
    }

    public String getLetterGrade() {
        if (numericGrade < 0 || numericGrade > 4) {
            return "Invalid grade";
        }

        if (numericGrade >= 3.85) {
            return "A";
        } else if (numericGrade >= 3.5) {
            return "A-";
        } else if (numericGrade >= 2.85) {
            return "B";
        } else if (numericGrade >= 2.5) {
            return "B-";
        } else if (numericGrade >= 1.85) {
            return "C";
        } else if (numericGrade >= 1.5) {
            return "C-";
        } else if (numericGrade >= 0.85) {
            return "D";
        } else if (numericGrade >= 0.5) {
            return "D-";
        } else {
            return "F";
        }
    }
}
