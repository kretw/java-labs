package Task1;

public class ThreadState {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Состояние потока во время выполнения: " + Thread.currentThread().getState());
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

            System.out.println("Состояние потока перед запуском: " + thread.getState());
            thread.start();
            System.out.println("Состояние потока после запуска: " + thread.getState());
            try{
            Thread.sleep(1000);
            System.out.println("Состояние потока после запуска: " + thread.getState());
        }
        catch(Exception e){
                e.getMessage();
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Состояние потока после завершения: " + thread.getState());
    }
}
