public class cntSubsequenceSumK {
    public int func(int[] arr, int sum, int ind){
        
        if(sum == 0) return 1;

        if(sum < 0 || ind == arr.length) return 0;

        return func(arr, sum - arr[ind], ind + 1) + func(arr, sum, ind + 1);
    }

    public int subsequence(int[] arr, int target){
        return func(arr, target, 0);
    }

     public static void main(String[] args) {
        cntSubsequenceSumK sol = new cntSubsequenceSumK();
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        System.out.println("Number of subsequences with target sum " + target + ": " + sol.subsequence(nums, target));
    }
}
