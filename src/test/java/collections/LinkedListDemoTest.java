package collections;

import org.junit.*;


import static org.junit.Assert.*;

public class LinkedListDemoTest {
    private LinkedListDemo linkedList = new LinkedListDemo();
    @Before
    public void init(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
    }

    @After
    public void clean(){
        linkedList = new LinkedListDemo();
    }

    @Test
    public void add() {
        assertEquals(3,linkedList.size());
    }

    @Test
    public void get() {
        assertEquals(1,linkedList.get(0));
        assertEquals(2,linkedList.get(1));
        assertEquals(3,linkedList.get(2));
    }

    @Test
    public void size() {
        assertEquals(3,linkedList.size());
    }


    @Test
    public void contains() {
        assertTrue(linkedList.contains(1));
        assertFalse(linkedList.contains(4));
    }

    @Test
    public void remove() {
        linkedList.remove(0);
        assertEquals(2,linkedList.get(0));
        linkedList.remove(1);
        assertEquals(2,linkedList.getLast().item);
        assertEquals(2,linkedList.getFirst().item);

    }

    @Test
    public void removeFirst() {
        linkedList.removeFirst();
        assertEquals(2,linkedList.size());
        assertEquals(2,linkedList.getFirst().item);

    }

    @Test
    public void removeLast() {
        linkedList.removeLast();
        assertEquals(2,linkedList.size());
        assertEquals(2,linkedList.getLast().item);
    }

    @Test
    public void set() {
        linkedList.set(1, 4);
        assertEquals(4, linkedList.get(1));
    }

    @Test
    public void indexOf() {
        assertEquals(1,linkedList.indexOf(2));
    }

    @Test
    public void lastIndexOf() {
        assertEquals(0,linkedList.indexOf(1));
    }

}