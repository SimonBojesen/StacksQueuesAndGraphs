public class Main {
    /*public static void main(String[] args) {
        Stack<Integer> numbers = new ArrayStack2(64);
        numbers.Push(7);
        numbers.Push(10);
        numbers.Push(13);
        numbers.Push(15);

        System.out.println(numbers.Pop());
        System.out.println(numbers.Peek());
    }*/

    public static void main(String[] args) {
        Stack<Integer> numbers1 = new ArrayStack2(64);
        numbers1.push(7);
        numbers1.push(10);
        numbers1.push(13);
        numbers1.push(15);

        System.out.println(numbers1.pop());
        System.out.println(numbers1.peek());

        Stack<Integer> numbers2 = new LinkedStack<Integer>();
        numbers2.push(7);
        numbers2.push(10);
        numbers2.push(13);
        numbers2.push(15);

        System.out.println(numbers2.pop());
        System.out.println(numbers2.peek());

        Queue<Integer> numberQueue = new LinkedQueue<Integer>();
        numberQueue.enqueue(1);
        numberQueue.enqueue(2);
        numberQueue.enqueue(3);
        numberQueue.enqueue(4);

        System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.peek());

        Graph graph = new LinkedArrayGraph(5);

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(4,1);
        graph.adjacents(1).forEach(adjacent -> {
            System.out.println("Adjacent: "+ adjacent);
        });
        System.out.println("Egdes: "+graph.getE());
        System.out.println("vertex: "+graph.getV());

        Stack<Integer> waiting = new ArrayStack2<>(16);
        //use queue for breadth first
        int source = 0;
        int target = 3;
        waiting.push(0);

        while (!waiting.isEmpty()) {
            int actual = waiting.pop();
            for (int a : graph.adjacents(actual)) {
                //if target = a stop searching;
                //if not visited a
                waiting.push(a);
            }
        }

    }
}
