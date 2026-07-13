public class peakElement {
    
    // Brute Force
    // public int search(int[] arr){
    //     int n = arr.length;
        
    //     for(int i = 0; i < n; i++){
    //         boolean left = (i == 0) || (arr[i] > arr[i+1]);
    //         boolean right = (i == n-1) || (arr[i] > arr[n-2]);

    //         if(left && right) return i;
    //     }
    //     return -1;
    // }   

    public int search(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low < high){
            int mid = (low + high)/2;

            if(arr[mid] > arr[mid + 1]){
                high = mid;
            }
            else low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        peakElement sol = new peakElement();
        int[] arr = {1, 3, 2, 4, 1, 0};
        int index = sol.search(arr);
        System.out.println("Peak at index: " + index + " with value: " + arr[index]);
    }
}
