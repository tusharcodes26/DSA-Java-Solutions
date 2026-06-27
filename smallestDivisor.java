
import java.util.Arrays;

public class smallestDivisor {
    // public int threshold(int[] arr, int limit){
    //     int n = arr.length;
        
    //     int max = Integer.MIN_VALUE;

    //     for(int val : arr){
    //         max = Math.max(max, val);
    //     }

    //     for(int d = 0; d < max; d++){
    //         int sum = 0;
    //         for(int i = 0; i<n;i++){
    //         sum += (int) Math.ceil((double) arr[i]/d);
    //         }
            
    //         if(sum <= limit){
    //             return d;
    //         }
    //     }
    //     return -1;
    // }

    private int sum(int[] arr, int div){
        int sum = 0;

        for(int num : arr){
            sum += (int) Math.ceil((double) num / div);
        }

        return sum;
    }

    public int threshold(int[] arr, int limit){
        int n = arr.length;

        if(n > limit) return -1;

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        while(low <= high){
            int mid = (low+high)/2;
            if(sum(arr, mid) <= limit){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;

        smallestDivisor obj = new smallestDivisor();
        int ans = obj.threshold(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
