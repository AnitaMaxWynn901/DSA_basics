public class MainStack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        System.out.println("Add Data into the Stack");
        System.out.println("Stack empty: " + stack.isEmpty());
        System.out.println("Stack push: ");
        for(int i = 1; i <= 5; i++){
            stack.push(i);
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Stack top: " + stack.peek());
        System.out.println("Stack empty: " + stack.isEmpty());
        System.out.println("Stack size: " + stack.getSize());

        System.out.println("\n----- Add more Data -----");
        System.out.print("Stack push: ");
        for(int j = 10; j <= 50; j+=10){
            stack.push(j);
            System.out.print(" " + j);
        }
        System.out.println();
        System.out.println("\nStack size: " + stack.getSize());
        System.out.println("Stack top: " + stack.peek());

        System.out.println("\n----- Remove the Stack -----");
        System.out.print("Stack pop: ");
        int s = stack.getSize();
        for(int k = 1; k <= s; k++){
            System.out.print(" " + stack.pop());
        }
        System.out.println("\nStack size: " + stack.getSize());
        System.out.println("Stack Empty: " + stack.isEmpty());
        stack.push(6);
        System.out.println("Stack push: " + stack.peek());
    }
}
