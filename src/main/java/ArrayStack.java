import java.util.ArrayList;
import java.util.List;

//Simon Kode
public class ArrayStack<T> implements Stack<T> {
    int size;
    int next = 0;
    private List<T> list;

    public ArrayStack(int size) {
        this.size = size;
        this.list = list = new ArrayList<T>();
    }

    public void push(T data) {
        this.list.add(data);
        this.next++;
    }

    public T pop() {
        this.next--;
        T data = this.list.get(next);
        this.list.remove(data);
        return data;
    }

    public T peek() {
        return this.list.get(next - 1);
    }

    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterable<T> items() {
        return null;
    }
}
