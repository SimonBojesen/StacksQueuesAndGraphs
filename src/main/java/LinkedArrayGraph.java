public class LinkedArrayGraph implements Graph{
    private Stack<Integer>[] vertices;
    private int edgeCount = 0;

    public LinkedArrayGraph(int verticeCount) {
        vertices = new Stack[verticeCount];
        for (int v = 0; v < verticeCount; v++) {
            vertices[v] = new ArrayStack2<>(verticeCount);
        }
    }

    public int getV() {
        return vertices.length;
    }

    public int getE() {
        return edgeCount;
    }

    public void addEdge(int v, int w) {
        // case of undirected linked graph
        vertices[v].push(w);
        vertices[w].push(v);
        edgeCount++;
    }

    public Iterable<Integer> adjacents(int v) {
        return vertices[v].items();
    }
}
