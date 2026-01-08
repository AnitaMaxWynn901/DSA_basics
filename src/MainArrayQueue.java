public class MainArrayQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(6);
        queue.printQueue();
        System.out.println();

        System.out.println("Add data into queue");
        System.out.print("Enqueue(): ");
        for(int i = 1; i <= 5; i++){
            queue.enqueue(i);
            System.out.print(i + " ");
        }
        System.out.println();
        queue.printQueue();

        System.out.println("First element: " + queue.peek());
        System.out.println();

        System.out.println("Remove 3 elements from queue");
        for(int i = 1; i <= 3; i++){
            System.out.println("Dequeue(): " + queue.dequeue());
            queue.printQueue();
            System.out.println();
        }
        System.out.println("First element: " + queue.peek());
        System.out.println();

        System.out.println("Add more data");
        System.out.println("Enqueue(): 10");
        queue.enqueue(10);
        queue.printQueue();
        System.out.println();

        System.out.println("Add more data");
        System.out.println("Enqueue(): 20");
        queue.enqueue(20);
        queue.printQueue();
        System.out.println();

        System.out.println("+++ Dequeue all data : +++");
        System.out.print("Remove ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
        queue.printQueue();

        System.out.println("Enqueue(): " + 90);
        queue.enqueue(90);
        queue.printQueue();
        System.out.println(queue.peek());
    }
}
