public class lowerBound{
    public int lower(int[] arr, int target){
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 4;

        lowerBound finder = new lowerBound();
        int ind = finder.lower(arr, x);

        System.out.println("The lower bound is the index: " + ind);
    }
}