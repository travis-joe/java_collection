package collections;

public class ArrayListDemo {
    private static final Object[] EMPTY_ELEMENT_DATA = {};
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;
    private int capacity;

    public ArrayListDemo() {
        this(0);
    }

    public ArrayListDemo(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            this.elementData = new Object[capacity];
        }
        if (capacity == 0) {
            this.elementData = EMPTY_ELEMENT_DATA;
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + capacity);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean add(Object obj) {
        if (elementData == EMPTY_ELEMENT_DATA) {
            elementData = new Object[DEFAULT_CAPACITY];
            this.capacity = DEFAULT_CAPACITY;
        }
        if (size == capacity) {
            resize();
        }

        elementData[size++] = obj;
        return true;
    }

    public boolean add(int index, Object obj) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds, index: " + index + "size: " + size);
        }
        if (size == capacity) {
            resize();
        }

        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = obj;
        size++;
        return true;
    }

    private void resize() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        Object[] newElementData = new Object[newCapacity];

        System.arraycopy(elementData, 0, newElementData, 0, oldCapacity);
        elementData = newElementData;
        capacity = newCapacity;
    }

    public Object remove(int index) {
        return null;
    }

    public boolean remove(Object value) {
        return false;
    }

    public Object get(int index) {
        return null;
    }

    public int indexOf(Object obj) {
        return -1;
    }

    public void set(int index, Object obj) {

    }
}
