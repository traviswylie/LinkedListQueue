/*
 * JUnit test for the LinkedListQueue class.
 * Some tests are provided; you are to also implement your own tests.
 */
package csc220util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListQueueTest {
    
    public LinkedListQueueTest() {}
    
    @BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
    @Before
    public void setUp() {}
    
    @After
    public void tearDown() {}

    /**
     * Test of enqueue method, of class LinkedListQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        LinkedListQueue<Integer> instance = new LinkedListQueue<>();
        instance.enqueue(1);
        instance.enqueue(2);
        assertEquals(instance.toString(), "1\n2\n");
    }

    /**
     * Test of dequeue method, of class LinkedListQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        LinkedListQueue<Integer> instance = new LinkedListQueue<>();
        Integer result = null;
        try
        {
            result = instance.dequeue();   
            fail("dequeue did not throw an exception on empty queue.");
        }
        catch (java.util.NoSuchElementException nsee)
        {
            
        }
        instance.enqueue(1);
        instance.enqueue(2);
        result = instance.dequeue();
        assertEquals(Integer.valueOf(1), result);
        result = instance.dequeue();
        assertEquals(Integer.valueOf(2), result);
    }

    /**
     * Test of toString method, of class LinkedListQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedListQueue<Integer> instance = new LinkedListQueue<>();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        instance.enqueue(1);
        result = instance.toString();
        expResult = "1\n";
        assertEquals(expResult, result);
   }

    /**
     * Test of isEmpty method, of class LinkedListQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedListQueue<Integer> instance = new LinkedListQueue<>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
}
