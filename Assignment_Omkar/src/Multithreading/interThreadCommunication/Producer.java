package Multithreading.interThreadCommunication;

public class Producer implements Runnable {
    private final Object monitor;
    private String message;

    public Producer(Object monitor) {
        this.monitor = monitor;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (monitor) {
                message = "Message " + i;
                System.out.println("Producing: " + message);
                monitor.notify(); // Notify a waiting consumer
                try {
                    monitor.wait(); // Release the lock and wait for the consumer
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

