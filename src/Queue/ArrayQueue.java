package Queue;

public class ArrayQueue {
    protected Object[] a;
    protected int max;
    protected int first, last;

    public ArrayQueue(int max) {
        this.max = max;
        a = new Object[max];
        first = last = -1;
    }

    public ArrayQueue() {
        this(10);
    }

    public boolean isEmpty() {
        return (first == -1);
    }

    public boolean isFull() {
        return ((first == 0 && last == max - 1) || first == last + 1);
    }

    public void enQueue(Object x) {
        if (last == max - 1 || last == -1) {
            a[0] = x;
            last = 0;
            if (first == -1) {
                first = 0;
            }
        } else {
            a[++last] = x;
        }
    }

    public Object front() throws Exception {
        if (isEmpty()) throw new Exception("This queue is empty");
        return a[first];
    }

    public Object deQueue() throws Exception {
        if (isEmpty()) throw new Exception("The queue is empty!");
        Object x = a[first];
        if (first == last) {
            first = last = -1;
        } else if (first == max - 1) {
            first = 0;
        } else {
            first++;
        }
        return x;
    }

    public void queueDisplay() {
        int i;
        if (first == last) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (i = first; i <= last; i++) {
            System.out.printf(" %d <-- ", a[i]);
        }
        return;
    }
}

