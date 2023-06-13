package Queue;

public class App {
      public static void main(String[] args) throws Exception {
        ArrayQueue q = new ArrayQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(9);
        q.queueDisplay();
        System.out.println(" ");
        q.deQueue();
        q.queueDisplay();
        System.out.println(" ");
        Object a = q.front();
        System.out.printf(" %d <-- ", a);
    }
}
