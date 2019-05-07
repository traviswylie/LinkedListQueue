/*
 * Travis Wylie
 * CSC220 PA5
 * 6MAY2019
 *
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
    public void testEnqueue()
    {
            // Integer Tests
        System.out.println("enqueue integer test 1");
        LinkedListQueue<Integer> instance1 = new LinkedListQueue<>();
        instance1.enqueue(1);
        instance1.enqueue(2);
        assertEquals(instance1.toString(), "1\n2\n");
        
        System.out.println("enqueue integer test 2");
        LinkedListQueue<Integer> instance2 = new LinkedListQueue<>();
        instance2.enqueue(1);
        assertEquals(instance2.toString(), "1\n");
        
        System.out.println("enqueue integer test 3");
        LinkedListQueue<Integer> instance3 = new LinkedListQueue<>();
        assertEquals(instance3.toString(), "");
        
        System.out.println("enqueue integer test 4");
        LinkedListQueue<Integer> instance4 = new LinkedListQueue<>();
        instance4.enqueue(30);
        instance4.enqueue(16);
        instance4.enqueue(32);
        assertEquals(instance4.toString(), "30\n16\n32\n");
        
        System.out.println("enqueue integer test 5");
        LinkedListQueue<Integer> instance5 = new LinkedListQueue<>();
        instance5.enqueue(100);
        instance5.enqueue(99);
        instance5.enqueue(98);
        instance5.enqueue(97);
        instance5.enqueue(96);
        instance5.enqueue(95);
        assertEquals(instance5.toString(), "100\n99\n98\n97\n96\n95\n");
        
            // String Tests
        System.out.println("enqueue String test 1");
        LinkedListQueue<String> instanceS1 = new LinkedListQueue<>();
        assertEquals(instanceS1.toString(), "");
        
        System.out.println("enqueue String test 2");
        LinkedListQueue<String> instanceS2 = new LinkedListQueue<>();
        instanceS2.enqueue("Adam");
        assertEquals(instanceS2.toString(), "Adam\n");
        
        System.out.println("enqueue String test 3");
        LinkedListQueue<String> instanceS3 = new LinkedListQueue<>();
        instanceS3.enqueue("Adam");
        instanceS3.enqueue("Xavier");
        instanceS3.enqueue("Bob");
        assertEquals(instanceS3.toString(), "Adam\n" + "Xavier\n" + "Bob\n");
        
        System.out.println("enqueue String test 4");
        LinkedListQueue<String> instanceS4 = new LinkedListQueue<>();
        instanceS4.enqueue("Adam");
        instanceS4.enqueue("Bob");
        instanceS4.enqueue("Charlie");
        instanceS4.enqueue(Integer.toString(1));
        instanceS4.enqueue("Edward");
        instanceS4.enqueue("Frank");
        assertEquals(instanceS4.toString(), "Adam\n" + "Bob\n" + "Charlie\n" + "1\n" + "Edward\n" + "Frank\n");
        
        System.out.println("enqueue String test 5");
        LinkedListQueue<String> instanceS5 = new LinkedListQueue<>();
        instanceS5.enqueue("Zulu");
        instanceS5.enqueue("Yankee");
        instanceS5.enqueue("Xray");
        instanceS5.enqueue("Whiskey");
        instanceS5.enqueue("Victor");
        instanceS5.enqueue("Uniform");
        instanceS5.enqueue("Tango");
        instanceS5.enqueue("Sierra");
        assertEquals(instanceS5.toString(), "Zulu\n" + "Yankee\n" + "Xray\n"
                    + "Whiskey\n" + "Victor\n" + "Uniform\n" + "Tango\n" + "Sierra\n");
        
        
            // Double Tests
        System.out.println("enqueue Double test 1");
        LinkedListQueue<Double> instanceD1 = new LinkedListQueue<>();
        assertEquals(instanceD1.toString(), "");
        
        System.out.println("enqueue Double test 2");
        LinkedListQueue<Double> instanceD2 = new LinkedListQueue<>();
        instanceD2.enqueue(1.0);
        assertEquals(instanceD2.toString(), "1.0\n");
        
        System.out.println("enqueue Double test 3");
        LinkedListQueue<Double> instanceD3 = new LinkedListQueue<>();
        instanceD3.enqueue(1.0);
        instanceD3.enqueue(0.5);
        assertEquals(instanceD3.toString(), "1.0\n0.5\n");
        
        System.out.println("enqueue Double test 4");
        LinkedListQueue<Double> instanceD4 = new LinkedListQueue<>();
        instanceD4.enqueue(0.0);
        instanceD4.enqueue(1.5);
        instanceD4.enqueue(3.0);
        assertEquals(instanceD4.toString(), "0.0\n1.5\n3.0\n");
        
        System.out.println("enqueue Double test 5");
        LinkedListQueue<Double> instanceD5 = new LinkedListQueue<>();
        instanceD5.enqueue(1.0);
        instanceD5.enqueue(2.5);
        instanceD5.enqueue(3.0);
        instanceD5.enqueue(4.5);
        instanceD5.enqueue(5.0);
        instanceD5.enqueue(6.5);
        assertEquals(instanceD5.toString(), "1.0\n2.5\n3.0\n4.5\n5.0\n6.5\n");
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
