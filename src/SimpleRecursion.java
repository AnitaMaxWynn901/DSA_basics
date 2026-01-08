import java.util.Scanner;
public class SimpleRecursion {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        SimRecur(n);
    }

    public static void SimRecur(int count){
        count--;
        System.out.println("The value of the count " + count);
        if(count > 0){
            SimRecur(count);
        }
        System.out.println("The count of number now: " + count);
    }
}
