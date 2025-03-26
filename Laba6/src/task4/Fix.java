package task4;

class Fix extends Workmans {
    private double monthlySalary;

    public Fix(double monthlySalary, String name) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calc() {
        return monthlySalary;
    }
}
