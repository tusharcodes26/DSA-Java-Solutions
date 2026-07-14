public class checkCntSubsequenceSumK {
    public boolean checkFunc(int i, int k, int[] arr){
        int n = arr.length;

        if(k == 0) return true;
        if(k < 0) return false;
        if(i == n) return k == 0;

        return checkFunc(i + 1, k - arr[i], arr) || checkFunc(i + 1, k, arr);
    }
    public boolean subsequence(int[] arr, int target){
        return checkFunc(0, target, arr);
    }
    public static void main(String[] args) {
        checkCntSubsequenceSumK sol = new checkCntSubsequenceSumK();
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        System.out.println(sol.subsequence(nums, target));
    }
}
