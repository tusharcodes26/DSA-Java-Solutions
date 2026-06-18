public class longestSubarrayWithGivenSumK {
    
    // Brute Force
    // public int sum(int[] arr, int k){
    //     int n = arr.length;
    //     int maxLength = 0;

    //     for(int start = 0; start < n; start++){
    //         for(int end = start; end < n; end++){

    //             int currSum = 0;
    //             for(int i = start; i <= end; i++){
    //                 currSum += arr[i];
    //             }

    //             if(currSum == k){
    //                 maxLength = Math.max(maxLength, end - start + 1);
    //             }
    //         }
    //     }

    //     return maxLength;
    // }

    // Optimal Approach

    public int sum(int[] arr, int k){
        int n = arr.length;
        int maxLength = 0;

        int left = 0, right = 0;

        int sum = arr[0];

        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
            if(right < n){
                sum += arr[right];
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,3,5,2};
        int k = 6;

        longestSubarrayWithGivenSumK sol = new longestSubarrayWithGivenSumK();

        int len = sol.sum(arr, k);

        System.out.println("The length of the longest subarray is: " + len);
    }
}
