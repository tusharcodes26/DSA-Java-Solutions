
import java.util.HashMap;
import java.util.Map;

public class subarraySumEqualsK {
    
    // Bruteb Force
    // public int sum(int[] arr, int k){
    //     int n = arr.length;
    //     int count = 0;

    //     for(int i = 0; i < n; i++){
    //         int sum = 0;
    //         for(int j = i; j < n; j++){
    //             sum += arr[j];
    //         if(sum == k) count++;
    //         }
    //     }
    //     return count;
    // }

    //Optimal Approach
    public int sum(int[] arr, int k){
        int n = arr.length;
        int count = 0;

        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        Map<Integer, Integer> m = new HashMap<>();

        for(int j = 0; j < n; j++){
            if(prefixSum[j] == k) count++;

            int val = prefixSum[j] - k;
            if(m.containsKey(val)){
                count += m.get(val);
            }

            m.put(prefixSum[j], m.getOrDefault(prefixSum[j], 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        int k = 3;

        subarraySumEqualsK sol = new subarraySumEqualsK();

        int len = sol.sum(arr, k);

        System.out.println("The length of the longest subarray is: " + len);
    }
}
