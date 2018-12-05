package collections;

public class LinkedListDemo {
    class Node {
        Object item;
        Node next;
        Node prev;

        Node(Node prev, Object item, Node next) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

    int size = 0;
    Node first;
    Node last;

    public boolean add(Object obj) {
        Node l = last;
        Node newNode = new Node(last, obj, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
    }


}

