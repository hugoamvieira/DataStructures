package LinkedList;


public class App {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(10);
        linkedList.insert(100);
        linkedList.insert(100);
        linkedList.insert(1000);
        linkedList.insert(10000);

        linkedList.traverse();

        linkedList.remove(100);
        System.out.print("\n");

        linkedList.traverse();
    }
}
