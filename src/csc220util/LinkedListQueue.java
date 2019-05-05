/*
 * Finish this implementation of a queue.  Use a linked list structure.
 */
package csc220util;

import java.util.NoSuchElementException;

public class LinkedListQueue<T> implements Queue<T>
{
    
    private int numberOfItems;
    private Node first;
    private Node last;
    
    public LinkedListQueue()
    {
        numberOfItems = 0;
        first = null;
        last = null;
    }
    
    @Override
    public void enqueue(T data) 
    {
        Node tmp = new Node(data);
        if (isEmpty())
        {
            first = tmp;
            last = tmp;
        }
        else
        {
            last.setNext(tmp);
            last = tmp;
        }
        numberOfItems++;
    }

    @Override
    public T dequeue() throws NoSuchElementException
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Queue is empty. Cannot dequeue");
        }
        else
        {
            Node dequeued = new Node(first.getData());
            first = first.getNext();
            if (numberOfItems == 0)
            {
                last = null;
            }
            return (T) dequeued.getData();
        }
    }
    
    @Override
    public String toString()
    {
        Node ptr = first;
        String string = "";
        
//        while (ptr.getNext() != null)
//        {
//            string += ptr.getData() + "\n";
//        }
        return string;
    }
    
    @Override
    public boolean isEmpty()
    {
        if (first == null){return true;}
        else {return false;}
    }
    
}
