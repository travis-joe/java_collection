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

    public void add(int index, Object obj) {
        if (!checkPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index is invalid, index:" + index);
        }
        if (index == size) {
            linkLast(obj);
        } else {
            linkBefore(obj, traverse(index));
        }
    }

    private void linkFirst(Object obj) {
        if (first != null) {
            Node oldFirst = first;
            Node node = new Node(null, obj, oldFirst);
            oldFirst.prev = node;
            first = node;
        } else {
            Node node = new Node(null, obj, null);
            first = node;
            last = node;
        }

        size++;
    }

    private void linkLast(Object obj) {
        if (last != null) {
            Node oldLast = last;
            Node node = new Node(oldLast, obj, null);
            oldLast.next = node;
            last = node;
        } else {
            Node node = new Node(null, obj, null);
            first = node;
            last = node;
        }

        size++;

    }

    private void linkBefore(Object obj, Node node) {
        Node preNode = node.prev;
        Node newNode = new Node(preNode, obj, node);
        node.prev = newNode;
        if (preNode == null) {
            first = newNode;
        } else {
            preNode.next = newNode;
        }
        size++;
    }

    private boolean checkPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    Node traverse(int index) {
        if (index < size / 2) {
            return traverseAhead(index);
        } else {
            return traverseReverse(index);
        }
    }

    private Node traverseAhead(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private Node traverseReverse(int index) {
        Node x = last;
        for (int i = size - 1; i > index; i--) {
            x = x.prev;
        }
        return x;
    }


    public Object remove(int index){

    }

    public boolean remore(Object obj) {

    }
}

