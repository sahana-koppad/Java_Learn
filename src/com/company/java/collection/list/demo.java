
import java.util.Stack;

public class demo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Original Stack:");
        System.out.println(stack);

        // peek()
        System.out.println("peek(): " + stack.peek());

        System.out.println("After peek:");
        System.out.println(stack);

        // pop()
        System.out.println("pop(): " + stack.pop());

        System.out.println("After pop:");
        System.out.println(stack);
    }
}