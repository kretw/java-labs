package Task2;

public class Main {
    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread("Поток 1");
        PrintThread thread2 = new PrintThread("Поток 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
