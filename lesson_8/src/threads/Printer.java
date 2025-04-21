package threads;
import java.util.concurrent.BlockingQueue;

public class Printer extends Thread {
    private final BlockingQueue<Integer> queue;

    public Printer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            int count = 1;
            while (true) {
                Integer number = queue.take();
                if (number == -1) {
                    break;
                }
                System.out.println("Число Фибоначчи №" + count + ": " + number);
                count++;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
