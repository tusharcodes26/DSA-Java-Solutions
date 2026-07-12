public class binarySearch {
    public static int search(int[] arr, int target){
        int n = arr.length;

        int low = 0;
        int high = n - 1;

        while(low <= high){
        int mid = (low + high)/2;
        if(arr[mid] == target) return mid;
        else if(target > arr[mid]) low = mid+1;
        else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 16;

        int ind = search(arr, target);

        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}
