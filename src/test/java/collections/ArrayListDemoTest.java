package collections;

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

    @Test
    public void isEmpty() {
    }

    @Test
    public void size() {
    }

    @Test
    public void add() {
        assertEquals(5,list.size());
        list.add(1, 2);
        assertEquals(6, list.size());
    }

    @Test
    public void add1() {
    }

    @Test
    public void remove() {
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