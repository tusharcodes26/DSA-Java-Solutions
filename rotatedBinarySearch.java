public class rotatedBinarySearch {
    public int search(int[] arr, int target){
        int n = arr.length;
        int high = n - 1;
        int low = 0;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target) return mid;
            
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
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 7;

        rotatedBinarySearch obj = new rotatedBinarySearch();
        int result = obj.search(nums, target);

        if (result == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + result);
    }
}
