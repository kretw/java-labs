import java.util.Random;

class Philosopher implements Runnable {
    private final Object leftFork;
    private final Object rightFork;
    private final Random random = new Random();
    private int eatCount = 0;
    private final int maxEatTime;
    private final String name;

    public Philosopher(Object leftFork, Object rightFork, int maxEatTime, String name) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.maxEatTime = maxEatTime;
        this.name = name;
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(name + " " + action);
        Thread.sleep(random.nextInt(500));
    }

    @Override
    public void run() {
        try {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < maxEatTime) {
                doAction(": размышляет");

                synchronized (leftFork) {
                    doAction(": взял левую вилку");
                    synchronized (rightFork) {
                        doAction(": взял правую вилку и ест");

                        eatCount++;
                        doAction(": положил правую вилку");
                    }
                    // Философ кладет левую вилку
                    doAction(": положил левую вилку. Снова размышляет");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getEatCount() {
        return eatCount;
    }
}
