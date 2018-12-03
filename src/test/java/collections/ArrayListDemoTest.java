package collections;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ArrayListDemoTest {
    private ArrayListDemo list;

    @Before
    public void initialize() {
        list = new ArrayListDemo();
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void size() {
    }

    @Test
    public void add() {
        list.add(1);
        list.add("abs");
        list.add(new Date());
        assertEquals(list.size(), 3);
        list.add(1, 2);
        assertEquals(list.size(), 4);
    }

    @Test
    public void add1() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void remove1() {
    }

    @Test
    public void get() {
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void set() {
    }
}