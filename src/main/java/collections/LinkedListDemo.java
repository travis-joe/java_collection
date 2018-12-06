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

    private int size = 0;
    private Node first;
    private Node last;

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


    public Object remove(int index) {
        if (!checkPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index is invalid, index:" + index);
        }
        return unlink(traverse(index));
    }

    public boolean remove(Object obj) {

    }
    public boolean removeLast(Object obj) {

    }
    public boolean removeFirst(Object obj) {

    }
    private Object unlink(Node node) {
        Object element = node.item;
        Node prev = node.prev;
        Node next = node.next;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }

        node.item = null;
        size--;
        return element;
    }

    public Object get(int index) {
        if (!checkPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index is invalid, index:" + index);
        }
        return traverse(index).item;
    }

    public Object set(int index, Object obj) {
        if (!checkPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index is invalid, index:" + index);
        }
        Node x = traverse(index);
        Object oldValue = x.item;
        x.item = obj;
        return oldValue;
    }

    public int size() {
        return size;
    }

    public int indexOf(Object obj) {
        int index = 0;
        if (obj == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (obj.equals(x.item)) {
                    return index;
                }
                index++;
            }
        }

        return -1;
    }
    public int lastIndexOf(Object obj) {
        int index = size;
        if (obj == null) {
            for (Node x = last; x != null; x = x.prev) {
                if (x.item == null) {
                    return index;
                }
                index--;
            }
        } else {
            for (Node x = last; x != null; x = x.prev) {
                if (obj.equals(x.item)) {
                    return index;
                }
                index--;
            }
        }

        return -1;
    }
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }


}

