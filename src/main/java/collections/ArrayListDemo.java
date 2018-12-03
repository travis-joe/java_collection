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

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public boolean add(Object obj){
        return false;
    }

    public void add(int index, Object obj){

    }

    public Object remove(int index){
        return null;
    }

    public boolean remove(Object value){
        return false;
    }

    public Object get(int index){
        return null;
    }

    public void set(int index, Object obj){

    }
}
