package queue;
public interface Queue <T> {
    public void enqueue(T element);
    public T dequeue(T element);
    public T peek(T element);
    public int size();
    public boolean isEmpty();
}
