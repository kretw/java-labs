package Task3;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(3);

        Thread producer1 = new Thread(new Producer(buffer), "Производитель");

        Thread consumer1 = new Thread(new Consumer(buffer), "Потребитель");

        producer1.start();
        consumer1.start();
    }
}

