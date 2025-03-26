import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Diner {
    public static void main(String[] args) throws InterruptedException {
        int numPhilosophers = 5;
        int maxEatTime = 50000;
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Object[] forks = new Object[numPhilosophers];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        ExecutorService executorService = Executors.newFixedThreadPool(numPhilosophers);

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];
            philosophers[i] = new Philosopher(leftFork, rightFork, maxEatTime, "Философ " + (i + 1));

            executorService.execute(philosophers[i]);
        }

        executorService.shutdown();
        executorService.awaitTermination(maxEatTime + 10000, TimeUnit.MILLISECONDS);

        for (int i = 0; i < philosophers.length; i++) {
            System.out.println("Философ " + (i + 1) + " поел " + philosophers[i].getEatCount() + " раз.");
        }
    }
}
