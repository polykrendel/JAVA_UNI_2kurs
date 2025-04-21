package app;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
import threads.*;

public class FibThreads {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер числа Фибоначчи, которое нужно найти: ");
        int FibNum = scanner.nextInt() - 1;
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Computator comp = new Computator(queue, FibNum);
        Printer prin = new Printer(queue);

        comp.start();
        prin.start();

        comp.join();
        prin.join();
    }
}