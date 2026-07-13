public class rotatedBinarySearchII {
    public boolean search(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target) return true;

            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid])
                    high = mid - 1;
                else low = mid + 1;
            }
            else{
                if(arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 9;

        rotatedBinarySearchII obj = new rotatedBinarySearchII();
        boolean ans = obj.search(arr, k);

        if (ans)
            System.out.println("Target is present in the array.");
        else
            System.out.println("Target is not present.");
    }
}
