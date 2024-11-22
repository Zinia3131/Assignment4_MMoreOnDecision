class Month {
    private int month;

    public Month(int month) {
        this.month = month;
    }

    public int getLength() {
        if (month < 1 || month > 12) {
            return -1; // Invalid month
        }
        if (month == 2) {
            return 28;
        }
        return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }
}


