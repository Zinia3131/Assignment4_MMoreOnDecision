class Paycheck {
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;

    // Constructor
    public Paycheck(String employeeName, double hourlyWage, double hoursWorked) {
        this.employeeName = employeeName;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate the total pay
    public double calculatePay() {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyWage;
        double overtimePay = overtimeHours * hourlyWage * 1.5;
        return regularPay + overtimePay;
    }

    // Method to print the paycheck
    public void printPaycheck() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Wage: $" + hourlyWage);
        System.out.printf("Total Pay: $%.2f%n", calculatePay());
    }
}

