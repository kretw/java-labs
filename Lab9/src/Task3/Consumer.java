package Task3;

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.take();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
