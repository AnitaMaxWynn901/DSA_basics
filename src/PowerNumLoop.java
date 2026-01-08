import java.util.Scanner;
public class PowerNumLoop {
    public static void main(String[] args) {
        System.out.print("Enter base number: ");
        Scanner input = new Scanner(System.in);
        int x =  input.nextInt();
        System.out.print("Enter power number: ");
        int n = input.nextInt();
        int pow = 1;
        for(int i = 1; i <= n; i++){
            pow *= x;
        }
        System.out.print("The power of " + x + " by " + n + " is " + pow);
    }
}
