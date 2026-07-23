
import java.util.HashMap;
import java.util.Map;

public class subarraySumK {
    
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
        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        Map<Integer, Integer> m = new HashMap<>();

        for(int j = 0; j < n; j++){
            if(prefix[j] == k) count++;

            int val = prefix[j] - k;

            if(m.containsKey(val)){
                count += m.get(val);
            }
            m.put(prefix[j], m.getOrDefault(prefix[j], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;

        subarraySumK sol = new subarraySumK();

        int len = sol.sum(arr, k);

        System.out.println("The length of the longest subarray is: " + len);
    }
}