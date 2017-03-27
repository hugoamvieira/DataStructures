package LinkedListStack;


public class LinkedListStack<T extends Comparable<T>> {

    private Node<T> rootNode;
    private int elCount;

    // Push, Peek and Pop Methods

    // O(1)
    public void push(T newData) {

        // Increment element count
        this.elCount++;

        if (this.rootNode == null) {
            // This is the first item
            this.rootNode = new Node<T>(newData);

        } else {
            // Get the old root, replace it w/ the new root and update reference
            // so that the new root's next node property points to the old root node.
            Node<T> oldRoot = this.rootNode;
            this.rootNode = new Node<T>(newData);
            this.rootNode.setNextNode(oldRoot);
        }
    }

    // O(1)
    public T peek() {
        return rootNode.getData();
    }

    // O(1)
    public T pop() {
        // Get the old root node, replace the root reference to the next node and decrease el count
        T itemToPop = this.rootNode.getData();
        this.rootNode = this.rootNode.getNextNode();
        this.elCount--;

        return itemToPop;
    }

    public int size() {
        return elCount;
    }
}
