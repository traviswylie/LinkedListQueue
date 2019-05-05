package csc220util;

public interface Queue<T>
{
    public void enqueue(T data);
    public T dequeue() throws java.util.NoSuchElementException;
    public boolean isEmpty();
}
