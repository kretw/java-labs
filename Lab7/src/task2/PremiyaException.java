package task2;

public class PremiyaException extends Exception {
    public PremiyaException(double premiya) {
        super("Премия не может быть отрицательной: " + premiya);
    }
}
