public class CountSameNumber {
    public static void main(String[] args) {
        int n = 500;

        int [] a = new int[n];
        int [] b = new int[n];
        int [] c = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = i+1;
            b[i] = i+2;
            c[i] = i+3;
        }
        int count = 0;
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(a[i] == b[j] && b[j] == c[k]){
                         count++;
                    }
                }
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Count = " + count);
        System.out.println("ElapsedTime = " + (endTime - startTime));
    }
}
