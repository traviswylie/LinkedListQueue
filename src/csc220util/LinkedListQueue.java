/*
 * This is a small change
 * Travis Wylie
 * CSC220 PA5
 * 6MAY2019
 *
 * This file contains the structure for a LinkedList of type T in queue data structure
 *
 * Finish this implementation of a queue.  Use a linked list structure.
 */
package csc220util;

import java.util.NoSuchElementException;

public class LinkedListQueue<T> implements Queue<T>
{
    
    private static class Node<T>
    {
        public T data;
        public Node next;
    }
    
    private int numberOfItems;
    private Node<T> first;
    private Node<T> last;
    
    public LinkedListQueue()
    {
        numberOfItems = 0;
        first = null;
        last = null;
    }
    
    // enqueue method creates new node tmp using supplied data. New node tmp
    // is placed at beginning if list is empty, else added to the end. Number
    // of items in list is increased by 1
    @Override
    public void enqueue(T data) 
    {
        Node<T> tmp = new Node<>();
        tmp.data = data;
        
        if (isEmpty())
        {
            first = tmp;
            last = tmp;
        }
        else
        {
            last.next = tmp;
            last = tmp;
        }
        numberOfItems++;
    }

    // dequeue method removes and returns dad from first node in queue. If
    // queue is empty, throw NoSuchElementException
    @Override
    public T dequeue() throws NoSuchElementException
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Queue is empty. Cannot dequeue");
        }
        else
        {
            Node<T> dequeued = new Node<>();
            dequeued.data = first.data;
            first = first.next;
            if (numberOfItems == 0)
            {
                last = null;
            }
        return (T) dequeued.data;
        }
    }
    
    // toString method creates string variable and adds the data from each
    // node in list, while node ptr is not null
    @Override
    public String toString()
    {
        Node<T> ptr = first;
        String string = "";
        
        while (ptr != null)
        {
            string += ptr.data + "\n";
            ptr = ptr.next;
        }
        return string;
    }
    
    // isEmpty method returns true if first element in list is null, otherwise
    // false
    @Override
    public boolean isEmpty()
    {
        if (first == null){return true;}
        else {return false;}
    }
    
}
