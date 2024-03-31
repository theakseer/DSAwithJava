import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {
    private LinkedList<T> queue = new LinkedList<T>();
    /* 
     * Operation in queue
     * init
     * Enqueue
     * isEmpty
     * size
     * peek
     */
    // initialization
    public Queue() {}
    public Queue(T elem){
        enqueue(elem);
    }
    
    // insertion
    public void enqueue(T elem){
        queue.addLast(elem);
    }
    
    // * Dequeue/pull
    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Empty queue");
        return queue.removeLast();
    }

    // size
    public int size() {
        return queue.size();
    }

    // isEmpty
    public boolean isEmpty() {
        return size() == 0;
    }

    // peek
    public T peek() {
        if (isEmpty()) throw new RuntimeException("Empty Stack");
        return queue.peekFirst();
    }

    //
    @Override
     public java.util.Iterator<T> iterator() {
        return queue.iterator();
     }
}
