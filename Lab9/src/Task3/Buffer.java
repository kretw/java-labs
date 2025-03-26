package Task3;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> queue;
    private int maxSize;

    public Buffer(int maxSize) {
        this.queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void put(int value) throws InterruptedException {
        while (queue.size() == maxSize) {
            wait();
        }
        queue.add(value);
        System.out.println(Thread.currentThread().getName() + " сгенерировал: " + value);
        notifyAll();
    }

    public synchronized void take() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        System.out.println(Thread.currentThread().getName() + " потребил: " + value);
        notifyAll();
    }
}
