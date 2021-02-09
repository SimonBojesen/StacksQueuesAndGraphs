import java.util.EmptyStackException;

public class LinkedQueue<T> implements Queue<T> {
    private Node<T> front = null;
    private Node<T> end = null;

    public void enqueue(T item) {
        if (end == null){
            front = end = new Node(null, item);
        }
        else{
            end.nextNode = new Node(null, item);
            end = end.nextNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) throw new EmptyStackException();
        T value = front.value;
        front = front.nextNode;
        return value;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return front.value;
    }

    public boolean isEmpty() {
        return end == null;
    }
}
