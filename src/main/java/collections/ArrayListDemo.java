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
            expand();
        }
        size = size + 1;
        elementData[size++] = obj;
        return true;
    }

    public boolean add(int index, Object obj) {
        rangeCheck(index);
        if (size == capacity) {
            expand();
        }

        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = obj;
        size++;
        return true;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds, index: " + index + "size: " + size);
        }
    }

    private void expand() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        Object[] newElementData = new Object[newCapacity];

        System.arraycopy(elementData, 0, newElementData, 0, oldCapacity);
        elementData = newElementData;
        capacity = newCapacity;
    }

    public Object remove(int index) {
        rangeCheck(index);
        Object value = elementData[index];
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        size = size - 1;
        elementData[size] = null;
        return value;
    }

    //删除第一个
    public boolean remove(Object obj) {
        if (obj == null) {
            for (int index = 0; index < size; index++) {
                if (elementData[index] == null) {
                    remove(index);
                    return true;
                }
            }
        } else {
            for (int index = 0; index < size; index++) {
                if (elementData[index].equals(obj)) {
                    remove(index);
                    return true;
                }
            }
        }
        return false;
    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            for (int index = 0; index < size; index++) {
                if (elementData[index] == null) {
                    return index;
                }
            }
        } else {
            for (int index = 0; index < size; index++) {
                if (elementData[index].equals(obj)) {
                    return index;
                }
            }
        }
        return -1;
    }

    public void set(int index, Object obj) {
        rangeCheck(index);
        elementData[index] = obj;
    }
}
