public class CLL {
    private class Node{
        private int element;
        private Node next;

        public Node(int data){
            element = data;
            next = null;
        }

        public void link(Node newNode){
            next = newNode;
        }

        public Node getNextNode(){
            return next;
        }

        public int getElement(){
            return element;
        }
    }
    // ------ End of Node ------

    private Node tail = null;
    private int size = 0;

    public void addFirst(int data){
        Node n = new Node(data);
        if(size == 0){
            tail = n;
            tail.link(n);
            size++;
        }
        else{
            n.link(tail.getNextNode());
            tail.link(n);
            size++;
        }
    }

    public void addLast(int data){
        Node n = new Node(data);
        if(size == 0){
            tail = n;
            tail.link(n);
            size++;
        }
        else{
            n.link(tail.getNextNode());
            tail.link(n);
            tail = n;
            size++;
        }
    }

    public void removeFirst(){
        if(size == 1){
            tail = null;
            size--;
        }
        else{
            Node p = tail.getNextNode();
            tail.link(p.getNextNode());
            p = null;
            size--;
        }
    }

    public void removeLast(){
        if(size == 1){
            tail = null;
            size--;
        }
        else{
            Node p = tail.getNextNode();
            while(p.getNextNode() != tail){
                p = p.getNextNode();
            }
            p.link(tail.getNextNode());
            tail = null;
            tail = p;
            size--;
        }
    }

    public void rotate(){
        if(size > 1){
            tail = tail.getNextNode();
        }
    }

    public void print(){
        if(size == 0){
            System.out.println("-----Empty Linked List-----");
        }
        else{
            Node p = tail.getNextNode();
            do {
                System.out.print("->" + p.getElement());
                p = p.getNextNode();
            }
            while(p != tail.getNextNode());{
                System.out.println("->");
            }
        }
    }
}
