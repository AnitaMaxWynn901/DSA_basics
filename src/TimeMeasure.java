public class TimeMeasure {
    public static void main(String[] args){
        int n = 1500;
        int result = 0;
        long StartTime = System.currentTimeMillis();
        for(int i = 0; i <= n; i++ ){
            for(int j = 0; j <= n; j++){
                for(int k = 0; k <= n; k++){
                    result = i + j + k;
                }
            }
        }
        long EndTime = System.currentTimeMillis();
        long EclapsedTime = EndTime - StartTime;
        System.out.println("Time taken: " + EclapsedTime + " ms");
    }
}
