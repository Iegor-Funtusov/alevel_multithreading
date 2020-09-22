package ua.com.alevel.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        if (args != null && args.length > 0) {
//        }
//        System.out.println("Hello, " + args[0]); // 1. Exception in thread "main"

//        Date date = new Date();
//        System.out.println("date = " + date);
//        System.out.println("date = " + date.getTime());
//        long start = System.currentTimeMillis();
//        System.out.println("start = " + start);
//        Thread thread = Thread.currentThread();
//        thread.start();
//        Thread.currentThread().sleep(5000);
//        System.out.println("end = " + (System.currentTimeMillis() - start));


//        while (true) {}

        //2

//        while (true) {
            //Do nothing //jps -l, jps -v, kill -9 <pid>
//        }

        //3

//        Thread currentThread = Thread.currentThread();
//        ThreadGroup threadGroup = currentThread.getThreadGroup();
//        System.out.println("Thread: " + currentThread.getName());
//        System.out.println("Thread Group: " + threadGroup.getName());
//        System.out.println("Parent Group: " + threadGroup.getParent().getName());

//        Thread th = Thread.currentThread();
//        th.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("Возникла ошибка: " + e.getMessage());
//            }
//        });
//        System.out.println(2/0);
//
//        System.out.println("th = " + th);

        //4

//        Thread thread = new CustomThread();
//        thread.start();

        //5

//        Object task = (CustomRunnable) (d, f) -> System.out.println("Hello, World!");
//        Thread thread = new Thread(task);
//        thread.start();


//        for (int i = 0; i < 10; i++) {
//            Runnable task = new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName());
//                    try {
//                        Writer writer = new FileWriter(Thread.currentThread().getName() + ".txt");
//                        String word = new Date().toString();
//                        char[] chars = word.toCharArray();
//                        writer.write(chars);
//                        writer.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            };
//            Thread thread = new Thread(task);
//            thread.start();
//        }

        for (int i = 0; i < 10; i++) {
            Thread thread = new CustomThread();
            thread.start();
        }

        //6

//        Runnable task = () -> System.out.println("Hello, World!");
//        Thread thread = new Thread(task);
//        thread.start();

        // 7 - yield

//        Runnable r = () -> {
//            int counter = 0;
//            while (counter < 3) {
//                System.out.println(Thread.currentThread().getName());
//                counter++;
//                Thread.yield();
//            }
//        };
//        new Thread(r).start();
//        new Thread(r).start();

        // 8 - sleep

//        Runnable task = () -> {
//            try {
//                int secToWait = 3000;
//                Thread.currentThread().sleep(secToWait);
//                System.out.println("Waked up");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//        Thread thread = new Thread(task);
//        thread.start();

        // OR

//        try {
//            System.out.println("Sleep");
//            TimeUnit.SECONDS.sleep(5);
//            System.out.println("Waked up");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //9  Thread.stop - Deprecated -> interrupt

//        Runnable task = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(3);
//                System.out.println("Waked up");
//            } catch (InterruptedException e) {
//                System.out.println("Interrupted");
//            }
//        };
//        Thread thread = new Thread(task);
//        thread.start();
//        thread.interrupt();

//        Runnable task = () -> {
//            while(!Thread.currentThread().isInterrupted()) { // - !Thread.currentThread().isInterrupted()
//                System.out.println("true = " + true);
//            }
//            System.out.println("Finished");
//        };
//        Thread thread = new Thread(task);
//        thread.start();
//        thread.interrupt();

        // 10 - join

//        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        Runnable task = () -> {
//            try {
//                System.out.println("Thread.currentThread().Runnable.getName() = " + Thread.currentThread().getName());
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                System.out.println("Interrupted");
//            }
//        };
//        Thread thread = new Thread(task);
//        System.out.println("thread = " + thread.getName());
//        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("thread = " + thread.getName());
//        System.out.println("Finished");


        // 11 - monitor and synchronized
        // *
        // The Java programming language provides multiple mechanisms for communicating between threads.
        // The most basic of these methods is synchronization, which is implemented using monitors.
        // Each object in Java is associated with a monitor, which a thread can lock or unlock.
        // Only one thread at a time may hold a lock on a monitor.
        // Any other threads attempting to lock that monitor are blocked until they can obtain a lock on that monitor.
        // A thread t may lock a particular monitor multiple times; each unlock reverses the effect of one lock operation.
        // */

        // biased locking - если за монитор нет борьбы между потоками
//        Object object = new Object();
//        synchronized(object) {
//            System.out.println("Hello World");
//        }


//        List<String> strings = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            Runnable task = new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName());
//                    synchronized (strings) {
//                        strings.add(UUID.randomUUID().toString());
//                    }
////                    Map<Object, Object> map = new ConcurrentHashMap<>();
////                    Map<Object, Object> map = new HashMap<>();
////                    strings.add(UUID.randomUUID().toString());
//                    try {
//                        TimeUnit.SECONDS.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            };
//            Thread thread = new Thread(task);
//            thread.start();
//        }
//        System.out.println("strings = " + strings);

        // basic locking - если монитор уже ранее был привязан к другому потоку

        /**
         * Здесь главный поток сначала отправляет задачу task в новый поток, а потом сразу же "захватывает" лок и выполняет с ним долгую операцию (8 секунд).
         * Всё это время task не может для своего выполнения зайти в блок synchronized, т.к. лок уже занят.
         * */

//        Object lock = new Object();
//
//        Runnable task = () -> {
//            synchronized (lock) {
//                System.out.println("thread");
//            }
//        };
//
//        Thread th1 = new Thread(task);
//        th1.start();
//        synchronized (lock) {
//            for (int i = 0; i < 8; i++) {
//                Thread.currentThread().sleep(1000);
//                System.out.print("  " + i);
//            }
//            System.out.println(" ...");
//        }

        // 12 - wait, notify и notifyAll

//        Object lock = new Object();
//        // task будет ждать, пока его не оповестят через lock
//        Runnable task = () -> {
//            synchronized(lock) {
//                try {
//                    lock.wait();
//                } catch(InterruptedException e) {
//                    System.out.println("interrupted");
//                }
//            }
//            // После оповещения нас мы будем ждать, пока сможем взять лок
//            System.out.println("thread");
//        };
//        Thread taskThread = new Thread(task);
//        taskThread.start();
//        // Ждём и после этого забираем себе лок, оповещаем и отдаём лок
//        Thread.currentThread().sleep(3000);
//        System.out.println("main");
//        synchronized(lock) {
//            lock.notify(); // wait and notify - Object
//        }

        // 13 life circle

        // NEW (new Thread) -> RUNNABLE (thread.start()) -> BLOCKED or WAITING -> TERMINATED

        // 14 Deadlock

//        final Friend alphonse = new Friend("Alphonse");
//        final Friend gaston = new Friend("Gaston");
//        new Thread(() -> alphonse.bow(gaston)).start();
//        new Thread(() -> gaston.bow(alphonse)).start();

        // 15 - Race condition

        /**
         * Состояние гонки возникает, когда один и тот же ресурс используется несколькими потоками одновременно,
         * и в зависимости от порядка действий каждого потока может быть несколько возможных результатов.
         * Код, приведенный ниже, не является потокобезопасным, и переменная value может быть инициализирована больше,
         * чем один раз, так как check-then-act (проверка на null, а затем инициализация), которая лениво инициализирует поле, не является атомарной:
         *
         * class Lazy <T> {
         *  private volatile T value;
         *  T get() {
         *    if (value == null)
         *      value = initialize();
         *    return value;
         *  }
         * }
         * */
    }

    private void sendMessage() {
        //fuh
    }
}
