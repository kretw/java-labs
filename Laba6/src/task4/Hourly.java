package task4;

class Hourly extends Workmans {
    private double hours;

    public Hourly(double hours, String name) {
        super(name);
        this.hours = hours;
    }

    @Override
    public double calc() {
        return 20.8 * 8 * hours;
    }
}
