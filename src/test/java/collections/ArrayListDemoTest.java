package collections;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.Iterator;

import static org.junit.Assert.*;

public class ArrayListDemoTest {
    private ArrayListDemo list;

    @Before
    public void initialize() {
        list = new ArrayListDemo();
        list.add(1);
        list.add("abs");
        list.add(new Date());
        list.add(1.5);
        list.add("3");
    }

    @After
    public void clean() {
        list = null;
    }

    @Test
    public void isEmpty() {
        list.remove(2);
        list.remove(0);
        list.remove("abs");
        list.remove(1.5);
        list.remove("3");
        assertTrue(list.isEmpty());
    }

    @Test
    public void size() {
        assertEquals(5,list.size());
    }

    @Test
    public void add() {
        assertEquals(5,list.size());
        list.add(1, 2);
        assertEquals(6, list.size());
        assertEquals(2, list.get(1));
        assertEquals("abs", list.get(2));
    }

    @Test
    public void remove() {
        list.remove(2);
        list.remove("abs");
        assertEquals(3,list.size());
        list.remove(1.5);
        assertEquals(2,list.size());

    }

    @Test
    public void get() {
        assertEquals("abs", list.get(1));
    }

    @Test
    public void indexOf() {
        assertEquals(1, list.indexOf("abs"));
    }

    @Test
    public void set() {
        list.set(2, "5050");
        assertEquals("5050", list.get(2));

    }

    @Test
    public void iterator() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("Next obj:" + obj);
            if("abs".equals(obj)){
                iterator.remove();
            }
        }

        assertEquals(-1, list.indexOf("abs"));
    }
}