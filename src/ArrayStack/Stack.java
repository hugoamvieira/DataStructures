package ArrayStack;

public class Stack<T> {

    private T[] stack;
    private int elCount;

    // Constructor. Instantiate new stack and set elements count as 0
    public Stack(int elements) {
        this.stack = (T[]) new Object[elements];
        elCount = 0;
    }


    // Push, Peek and Pop Methods

    // O(1) w/o resize. O(N) w/ resize.
    public void push(T data) {

        if (elCount == this.stack.length) {
            // The stack is full. Resize with twice the length.
            resizeStack(2 * this.stack.length);
        }

        // Push the data onto the stack.
        this.stack[elCount++] = data;
    }

    // O(1)
    public T peek() {
        return this.stack[elCount - 1];
    }

    // O(1) w/o resize. O(N) with resize.
    public T pop() {
        T itemToPop = this.stack[--elCount];

        if (elCount > 0 && this.elCount == this.stack.length / 4) {
            // If we have elements and the stack is at 25% of its capacity, then we resize it back by 50%
            resizeStack(this.stack.length / 2);
        }

        return itemToPop;
    }


    // Resizes the array stack.
    private void resizeStack(int newSize) {

        T[] newStack = (T[]) new Object[newSize];

        // Copy the data in the stack to the new stack;
        for (int i = 0; i < elCount; i++) {
            newStack[i] = this.stack[i];
        }

        // Replace the old stack with the new stack
        this.stack = newStack;
    }

    public int size() {
        return elCount;
    }
}
