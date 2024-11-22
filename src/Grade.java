import java.util.Scanner;

class Grade {
    private String letterGrade;

    // Constructor
    public Grade(String letterGrade) {
        this.letterGrade = letterGrade.trim();
    }

    // Method to convert letter grade to numeric grade
    public double getNumericGrade() {
        // Base numeric values for grades
        double baseValue = 0.0;

        // Get the first character (grade letter)
        char baseLetter = letterGrade.charAt(0);

        // Determine the base numeric value
        switch (baseLetter) {
            case 'A': baseValue = 4.0; break;
            case 'B': baseValue = 3.0; break;
            case 'C': baseValue = 2.0; break;
            case 'D': baseValue = 1.0; break;
            case 'F': baseValue = 0.0; break;
            default: return -1; // Invalid grade
        }

        // Handle modifiers (+ or -)
        if (letterGrade.length() > 1) {
            char modifier = letterGrade.charAt(1);
            if (modifier == '+' && baseLetter != 'A') {
                baseValue += 0.3;
            } else if (modifier == '-') {
                baseValue -= 0.3;
            }
        }

        // Ensure the numeric value is within range [0.0, 4.0]
        return Math.max(0.0, Math.min(4.0, baseValue));
    }
}
