public class ArrayStackChar {
    private final static int CAPACITY = 10;
    private int[] data;
    private int size;
    public ArrayStackChar() {
        data = new int[CAPACITY];
    }
    public ArrayStackChar(int capacity) {
        data = new int[capacity];
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int e) {
        if(size == data.length){
            resize();
        }
        data[size] = e;
        size++;
    }
    public int peek(){
        if(size == 0){
            return -999;
        }
        else{
            int element = data[size-1];
            return element;
        }
    }

    public int pop(){
        if(size == 0){
            return -999;
        }
        else{
            int element = data[size-1];
            size--;
            return element;
        }
    }

    public void resize(){
        System.out.println("\nDouble stack's size");
        int[] temp = new int[data.length*2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

}
