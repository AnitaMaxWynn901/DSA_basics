public class SLL {
    private class Node{
        private int element;
        private Node next;

        //Constructor
        public Node(int data){
            element = data;
            next = null;
        }
        // link a new node to this node
        public void link(Node newNode){
            next = newNode;
        }
        //return the next Node
        public Node getNextNode(){
            return next;
        }
        //return the element of Node
        public int getElement(){
            return element;
        }
    }
    // ------------ End Node ---------------

    // SLL properties and methods
    private Node head = null;
    private Node tail = null;
    private int size = 0; //SLL size

    //Linked list size
    public int size(){
        return size;
    }

    // Element is empty or not?
    public boolean isEmpty(){
        boolean isEmpty = false;
        if(size == 0){
            isEmpty = true;
        }
        return isEmpty;
    }

    //get element data
    public int get(int index){
        Node p = head;
        for(int i = 0; i < index; i++){
            p = p.getNextNode();
        }
        return p.getElement();
    }

    //Clear nodes
    public void clear(){
        size = 0;
        head = null;
        tail = null;
    }

    // find element in nodes
    public boolean findElement(int fe){
        boolean findElement = true;
        Node p = head;
        while(p.getNextNode() != tail){
            p = p.getNextNode();
            if(p.getElement() == fe){
                findElement = true;
            }
            else{
                findElement = false;
            }
            if(head.getElement() == fe || tail.getElement() == fe) {
                findElement = true;
            }
        }
        return findElement;
    }

    // Count element in nodes
    public int countElement(int ce){
        int countElement = 0;
        Node p = head;
        while(p.getNextNode() != null){
            if(p.getElement() == ce){
                countElement++;
            }
            p = p.getNextNode();
        }
        if(tail.getElement() == ce){
            countElement++;
        }
        return countElement;
    }

    //Sum of the elements in nodes
    public int sumElement(){
        int sumElement = 0;
        Node p = head;
        while(p.getNextNode() != null){
            sumElement += p.getElement();
            p = p.getNextNode();
        }
        sumElement += tail.getElement();
        return sumElement;
    }

    // add first node
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(size == 0){
            tail = newNode;
        }
        else{
            newNode.link(head);
        }
        head = newNode;
        size++;
    }

    // add last node
    public void addLast(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
        }
        else{
            tail.link(newNode);
        }
        tail = newNode;
        size++;
    }

    // remove first node
    public void removeFirst(){
        if(size == 1){
            head = null;
            tail = null;
            size--;
        }
        else{
            head = head.getNextNode();
            size--;
        }
    }

    //remove last node
    public void removeLast(){
        if(size == 1){
            head = null;
            tail = null;
            size--;
        }
        else{
            Node p = head;
            while(p.getNextNode() != tail){
                p = p.getNextNode();
            }
            tail = p;
            tail.link(null);
            size--;
        }
    }
    //show all node
    public void print(){
        if(size == 0){
            System.out.println("Empty linked list");
        }
        else{
            for(Node p = head; p != null; p = p.getNextNode()){
                    System.out.print(p.getElement() + "->");
            }
            System.out.println("null");
        }
    }
}
