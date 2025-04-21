package threads;
import java.util.concurrent.BlockingQueue;

public class Computator extends Thread {
    private final BlockingQueue<Integer> queue;
    private final int Num;

    public Computator(BlockingQueue<Integer> queue, int Num) {
        this.queue = queue;
        this.Num = Num;
    }

    @Override
    public void run() {
        try {
            int n1 = 0, n2 = 1;
            queue.put(n1);
            if (Num > 0) {
                queue.put(n2);
            }
            for (int i = 2; i <= Num; i++) {
                int next = n1 + n2;
                queue.put(next);
                n1 = n2;
                n2 = next;
            }
            queue.put(-1); // Маркер завершения
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
