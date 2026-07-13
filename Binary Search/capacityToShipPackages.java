import java.util.Arrays;

public class capacityToShipPackages {
    private int daysNeeded(int[] weights, int capacity){
        int days = 1;
        int currLoad = 0;

        for (int i : weights) {
            if(currLoad + i > capacity){
                days++;
                currLoad = i;
            }
            else 
                currLoad += i;
        }
        return days;
    }

//     public int ship(int[] weights, int d){
//         int left = Arrays.stream(weights).max().getAsInt();
//         int right = Arrays.stream(weights).sum();

//         for(int capacity = left; capacity <= right; capacity++){
//             int needed = daysNeeded(weights, capacity);
//             if(needed <= d){
//                 return capacity;
//             }
//         }
//         return high;
//     }

    public int ship(int[] weights, int d){
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        
        while(low <= high){
            int mid = (low+high)/2;

            int needed = daysNeeded(weights, mid);
            if(needed <= d){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return low;
    }


    public static void main(String[] args) {
        // Input weights
        int[] weights = {5,4,5,2,3,4,5,6};
        // Days to ship
        int d = 5;
        // Create Solution instance
        capacityToShipPackages sol = new capacityToShipPackages();
        // Call the function and print result
        System.out.println(sol.ship(weights, d));
    }
}