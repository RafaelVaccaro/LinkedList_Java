public class LinkedList {
    Node head;

    public void add(int data) {
        Node newNodo = new Node(data);
        newNodo.next = head;
        head = newNodo;
    }

    public void remove() {
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
