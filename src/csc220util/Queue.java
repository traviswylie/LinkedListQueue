/*
 * Travis Wylie
 * CSC220 PA5
 * 6MAY2019
 *
 * This is an abstract interface for a queue data structure
*/
package csc220util;

public interface Queue<T>
{
    public void enqueue(T data);
    public T dequeue() throws java.util.NoSuchElementException;
    public boolean isEmpty();
}
