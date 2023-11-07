package Multithreading.interThreadCommunication;

public class Consumer implements Runnable {
    private final Object monitor;
    private String message;

    public Consumer(Object monitor) {
        this.monitor = monitor;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (monitor) {
                try {
                    monitor.wait(); // Wait for the producer to notify
                    message = "Consumed: " + message;
                    System.out.println(message);
                    monitor.notify(); // Notify the producer to produce the next message
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

