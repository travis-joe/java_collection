package collections;

public class ArrayListDemo {
    private static final Object[] EMPTY_ELEMENT_DATA = {};
    private Object[] elementData;
    private int size;
    private int capacity;

    public ArrayListDemo() {
        this(0);
    }

    public ArrayListDemo(int capacity) {
        if(capacity > 0) {
            this.capacity = capacity;
            this.elementData = new Object[capacity];
        }
        if(capacity == 0) {
            this.elementData = EMPTY_ELEMENT_DATA;
        }
        if(capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + capacity);
        }
    }
}
