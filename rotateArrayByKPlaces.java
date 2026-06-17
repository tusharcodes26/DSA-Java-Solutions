// Brute Force Approach

// import java.util.Arrays;

// public  class rotateArrayByKPlaces {
//     public void rotateRight(int[] arr, int k){

//         int n = arr.length;
//         if(n == 0) return;

//         k = k % n;

//         int temp[] = Arrays.copyOfRange(arr, n-k, n);

//         for(int i = n - k - 1; i >=0; i--){
//             arr[i + k] = arr[i];
//         }

//         for(int i = 0; i < k; i++){
//             arr[i] = temp[i];
//         }
//     }

//     public void rotateLeft(int[] arr, int k){

//         int n = arr.length;
//         if(n == 0) return;

//         k = k % n;

//         int temp[] = Arrays.copyOfRange(arr, 0, k);

//         for(int i = k; i < n; i++){
//             arr[i - k] = arr[i];
//         }

//         for(int i = 0; i < k; i++){
//             arr[n - k + i] = temp[i];
//         }
//     }

//     public static void main(String[] args) {

//         rotateArrayByKPlaces sol = new rotateArrayByKPlaces();

//         int[] arr = {1,2,3,4,5,6,7};
//         int k = 2;
        
//         sol.rotateRight(arr, k);
//         System.out.println("Array after right rotation: " + Arrays.toString(arr));
        
//         int[] arr2 = {1,2,3,4,5,6,7};
//         sol.rotateLeft(arr2, k);
//         System.out.println("Array after right rotation: " + Arrays.toString(arr2));

//     }
// }





// Optimal Solution

public class rotateArrayByKPlaces{
    public void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public int[] rotateArray(int[] arr, int k, String direction){

        int n = arr.length;

        if(n==0 || k==0) return arr;

        k = k % n;

        if(direction.equals("right")){
            reverse(arr, 0, n-1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n-1);
        }

        if(direction.equals("left")){
            reverse(arr, 0, k-1);
            reverse(arr, k, n-1);
            reverse(arr, 0, n-1);
        }

        return arr;
    }

    public static void main(String[] args){
        rotateArrayByKPlaces sol = new rotateArrayByKPlaces();

        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        String direction = "left";

        sol.rotateArray(arr, k, direction); 

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}