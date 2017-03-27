package LinkedListStack;


public class App {

    public static void main(String[] args) {

        LinkedListStack<Integer> stack = new LinkedListStack<Integer>();

        stack.push(10);
        stack.push(100);
        stack.push(1000);
        stack.push(10000);
        stack.push(100000);
        stack.push(1000000);

        System.out.println("Peeking: " + stack.peek());

        System.out.println(stack.pop() + " got capped.");
        System.out.println(stack.pop() + " got capped.");
        System.out.println(stack.pop() + " got capped.");


        System.out.println("Peeking: " + stack.peek());
    }
}
