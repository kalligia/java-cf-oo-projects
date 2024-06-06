package ch14;

public class StackManager {
    private static final StackManager INSTANCE = new StackManager();
    static int top = -1;
    static String[] stack = new String[2];

    private StackManager() {

    }

    public static StackManager getInstance() {
        return INSTANCE;
    }

    public static void push(String s) {

        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = s;
        System.out.println("Pushed: " + s);
    }

    public static String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return "-1";
        }
        return stack[top--] ;
    }

    private static boolean isFull() {
        return top == stack.length - 1;
    }

    private static boolean isEmpty() {
        return top == - 1;
    }

    public static void traverseStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
