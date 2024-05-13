package org.kuilz.SingletonPattern.LazyUnsafe;

public class SingletonTest {
    public static void main(String[] args) {
        int numThreads = 10;
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new MyRunnable());
            threads[i].start();
        }
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getId() + ", Singleton hashCode: " + singleton.hashCode());
        }
    }
}
