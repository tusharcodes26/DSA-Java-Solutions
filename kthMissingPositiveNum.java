public class kthMissingPositiveNum {
    // public int missing(int[] arr, int k){
    //     int n = arr.length;

    //     for(int i = 0; i < n; i++){
    //         if(arr[i] <= k){
    //             k++;
    //         }
    //         else break;
    //     }
    //     return k;
    // }

    public int missing(int[] arr, int k){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high)/2;
            int miss = arr[mid] - (mid + 1);

            if(miss < k){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return low+k;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        kthMissingPositiveNum finder = new kthMissingPositiveNum();
        int val = finder.missing(arr, k);
        System.out.println(val);
    }
}
