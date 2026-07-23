public class kadaneAlgo {
    // Brute Solution
    // public int maxSubArray(int[] arr){
    //     int n = arr.length;
    //     int maxi = Integer.MIN_VALUE;

    //     for(int i = 0; i < n; i++){
    //         for(int j = i; j < n; j++){
    //             int sum = 0;
    //             for(int k = i; k < j; k++){
    //                 sum += arr[k];
    //             }
    //             maxi = Math.max(maxi, sum);
    //         }
    //     }
    //     return maxi;
    // }

    // Better Solution
    // public int maxSubArray(int[] arr){
    //     int n = arr.length;
    //     int maxi = Integer.MIN_VALUE;
        
    //     for(int i = 0; i < n; i++){
    //         int sum = 0;
    //         for(int j = i; j < n; j++){
    //             sum += arr[j];
    //             maxi = Math.max(maxi, sum);
    //         }
    //     }
    //     return maxi;
    // }

    // Optimal Solution
    public int maxSubArray(int[] arr){
        int n = arr.length;
        long maxi = Integer.MIN_VALUE;

        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];

            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return (int) maxi;
    }

    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        kadaneAlgo al = new kadaneAlgo();

        int maxSum = al.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}