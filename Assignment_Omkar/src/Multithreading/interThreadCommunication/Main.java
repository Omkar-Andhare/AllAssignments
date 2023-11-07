package Multithreading.interThreadCommunication;

public class Main {
    public static void main(String[] args) {
        Object monitor = new Object();
        Producer producer = new Producer(monitor);
        Consumer consumer = new Consumer(monitor);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
