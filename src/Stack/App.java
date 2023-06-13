package Stack;

public class App {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        for (int i = 0; i < 7; i++) {
            arrayStack.push(i);
        }

        arrayStack.printStack();
        arrayStack.pop();
        arrayStack.printStack();
        Object a = arrayStack.top();
        System.out.println(a);
    }
}