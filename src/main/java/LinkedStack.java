import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {
    private Node<T> top = null;

    public void push(T item) {
        top = new Node(top, item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.value;
        top = top.nextNode;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Iterable<T> items() {
        return null;
    }
}
