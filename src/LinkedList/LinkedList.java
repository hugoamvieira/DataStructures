package LinkedList;


public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> rootNode;
    private int elCount = 0;

    @Override
    public void insert(T data) {

        this.elCount++;
        if (rootNode == null) {
            // This is the first element
            rootNode = new Node<T>(data);

        } else {
            // Insert at the beginning of the LL. O(1)
            Node<T> newNode = new Node<T>(data);
            newNode.setNextNode(this.rootNode);
            this.rootNode = newNode;
        }
    }

    // O(N)
    @Override
    public void remove(T data) {

        this.elCount--;

        if (rootNode == null) return;
        // Test if we have found the node with the data we want to remove.
        if (rootNode.getData().compareTo(data) == 0) {
            this.rootNode = this.rootNode.getNextNode();

            // If not, call the other remove method which traverses the list and finds the element
        } else {
            remove(data, rootNode, rootNode.getNextNode());
        }
    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {

        while (actualNode != null) {
            // Test if we have found the node with the data we want to remove
            if (actualNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            // Didn't find it. Keep hopping on, young grasshopper.
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    // O(N)
    @Override
    public void traverse() {

        if (this.rootNode == null) return;

        // Get the root node
        Node<T> actualNode = this.rootNode;

        // Iterate until it reaches the end of the list.
        while (actualNode != null) {
            System.out.print(actualNode + " -> ");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return elCount;
    }
}
