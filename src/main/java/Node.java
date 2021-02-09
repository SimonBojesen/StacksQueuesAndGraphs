public class Node<T> {
    final T value;
    Node<T> nextNode;

    public Node(Node<T> nextNode, T value) {
        this.nextNode = nextNode;
        this.value = value;
    }
}