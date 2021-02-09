import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

//Anders Kode
public class ArrayStack2<T> implements Stack<T> {
    private int next = 0;
    private T[] data;

    public ArrayStack2(int max) {
        this.data = (T[]) (new Object[max]);
    }

    private int addOneAfterUse() {
        int value = next;
        next = next + 1;
        return value;
    }

    private int subtractOneBeforeUse() {
        next = next + 1;
        return next;
    }

    public void push(T item) {
        data[next++] = item;
    }

    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        return data[--next];
    }

    public T peek() {
        if(isEmpty()) throw new EmptyStackException();
        return data[next - 1];
    }

    public boolean isEmpty() {
        return next == 0;
    }

    public Iterable<T> items() {
        List<T> items = new ArrayList<T>();
        for (int i = 0; i < next; i++) {
            items.add(data[i]);
        }
        return items;
    }
}