package ua.com.alevel.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomThread extends Thread {

    private volatile String string = UUID.randomUUID().toString();
    private volatile int anInt;
    private AtomicInteger integer;

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println("currentThread: " + currentThread.getName());

        try {
            Writer writer = new FileWriter("test.txt");
            char[] chars = string.toCharArray();
            writer.write(chars);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
