package app;

import singleton.*;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Runnable t = () -> {
            Singleton settings = Singleton.getInstance();

            synchronized (settings) {
                String threadName = Thread.currentThread().getName();
                System.out.println("Настройки потока: " + threadName);
                List<String> l = settings.info.get(threadName);
                if (l != null) {
                    for (String item : l) {
                        System.out.println("  - " + item);
                        settings.setSetting(threadName, item);
                    }
                }
            }
        };

        Thread t1 = new Thread(t, "Тема");
        Thread t2 = new Thread(t, "Язык");
        Thread t3 = new Thread(t, "Путь к файлам");
        t1.start();
        t2.start();
        t3.start();
    }
}