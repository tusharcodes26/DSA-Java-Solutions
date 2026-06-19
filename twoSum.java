
import java.util.Arrays;

public class twoSum {
    
    // Brute Force
    // public String sum(int[] arr, int k){
    //     int n = arr.length;

    //     for(int i = 0; i< n; i++){
    //         for (int j = i + 1; j < n; j++){
    //             if(arr[i] + arr[j] == k){
    //                 return "YES";
    //             }
    //         } 
    //     }
    //     return "NO";
    // }
    // public int[] sumIndices(int[] arr, int k){
    //     int n = arr.length;

    //     for(int i = 0; i< n; i++){
    //         for (int j = i + 1; j < n; j++){
    //             if(arr[i] + arr[j] == k){
    //                 return new int[]{i,j};
    //             }
    //         } 
    //     }
    //     return new int[]{-1,-1};
    // }

    // Better Solution - Most Optimal
    // public String sum(int[] arr, int k){
    //     int n = arr.length;
    //     Map<Integer,Integer> map = new HashMap<>();

    //     for(int i = 0; i < n; i++){
    //         int comp = k - arr[i];
    //         if(map.containsKey(comp)){
    //             return "YES";
    //         }
    //         map.put(arr[i], i);
    //     }
    //     return "NO";
    // }
    // public int[] sumIndices(int[] arr, int k){
    //     int n = arr.length;
    //     Map<Integer,Integer> map = new HashMap<>();

    //     for(int i = 0; i < n; i++){
    //         int comp = k - arr[i];
    //         if(map.containsKey(comp)){
    //             return new int[] {map.get(comp),i};
    //         }
    //         map.put(arr[i], i);
    //     }
    //     return new int[] {-1, -1};
    // }

    //Optimal Solution - Not that Optimal
    public String sum(int[] arr, int k){
        int n = arr.length;

        int[][] arrWithIndex = new int[n][2];

        for(int i = 0; i < n; i++){
            arrWithIndex[i][0] = arr[i];
            arrWithIndex[i][1] = i;
        }

        Arrays.sort(arrWithIndex, (a,b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;

        while(left < right){
            int sum = arrWithIndex[left][0] + arrWithIndex[right][0];

            if(sum == k){
                return "YES";
            }
            else if(sum < k){
                left++;
            }
            else
                right--;
        }
        return "NO";
    }

    public int[] sumIndices(int[] arr, int k){
        int n = arr.length;

        int[][] arrWithIndex = new int[n][2];

        for(int i = 0; i < n; i++){
            arrWithIndex[i][0] = arr[i];
            arrWithIndex[i][1] = i;
        }

        Arrays.sort(arrWithIndex, (a,b) -> Integer.compare(a[0], b[0]));

        int left = 0; int right = n - 1;

        while(left < right){
            int sum = arrWithIndex[left][0] + arrWithIndex[right][0];

            if(sum == k){
                return new int[] {arrWithIndex[left][1], arrWithIndex[right][1]};
            }
            else if(sum < k){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        twoSum sol = new twoSum();

        int[] arr = {2, 3, 5, 7, 6, 11};
        int k = 11;

        System.out.println(sol.sum(arr, k));

        int[] res = sol.sumIndices(arr, k);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
