package Task2;

class PrintThread extends Thread {
    private static final Object lock = new Object();
    private String threadName;

    public PrintThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                System.out.println(threadName);
                try {
                    lock.notify();
                    if (i < 4) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




