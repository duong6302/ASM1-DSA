package LinkedList;

public class App {
    public static void main(String[] args) {
        MyList ml = new MyList();
        for(int i = 0; i <= 8; i++) {
            ml.add(i);
        }
        ml.traverse();
    }
}
