
import java.util.Arrays;


public class minDaysToMakeMBouqets{         

    public boolean isPossible(int[] bloomDays, int day, int m, int k){
        int count = 0;
        int bouquets = 0;

        for(int bloom : bloomDays){
            if(bloom <= day){
                count++;
                if(count == k){
                    bouquets++; 
                    count = 0;
                }
            }
            else count = 0;
        }
        return bouquets >= m;
    }
        public int minDays(int[] bloomDays, int m, int k){
            int n = bloomDays.length;
            if(n < (m*k)) return -1;

            int minDay = Arrays.stream(bloomDays).min().getAsInt();
            int maxDay = Arrays.stream(bloomDays).max().getAsInt();

            
            // int minDay = Integer.MAX_VALUE;
            // int maxDay = Integer.MIN_VALUE;

            // for(int bloom : bloomDays){
            //     minDay = Math.min(minDay, bloom);
            //     maxDay = Math.max(maxDay, bloom);
            // }
            int low = minDay, high = maxDay, result = -1;
            
            while(low <= high){
                int mid = (low+high)/2;
                if(isPossible(bloomDays, mid, m, k)){
                    result = mid;
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            return result;
        }
     public static void main(String[] args) {
        int[] bloomDays = {7,7,7,7,12,7,7};
        int k = 3;
        int m = 2;

        minDaysToMakeMBouqets garden = new minDaysToMakeMBouqets();
        int result = garden.minDays(bloomDays, m, k);

        if (result == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + result);
}
}