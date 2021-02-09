public interface Graph {
    int getV(); //number of vertices
    int getE(); //number of edges
    void addEdge(int V, int W);
    Iterable<Integer> adjacents(int v);
}
