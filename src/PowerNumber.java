import java.util.Scanner;
public class PowerNumber {
    public static void main(String[] args) {
        System.out.print("Enter base number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print("Enter power number: ");
        int n = input.nextInt();
        System.out.print("Power of " + x + " by " + n +  " " + Power(x,n));
    }
    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }
        else{
            return (x * Power(x, n - 1));
        }
    }
}
