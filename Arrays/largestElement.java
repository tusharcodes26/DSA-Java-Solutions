

public class largestElement {
    public static int sortArr(int[] arr, int n){

        int max = arr[0];
        for(int i = 0; i <= n-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
//         Arrays.sort(arr);

//         return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        
        int[] arr1 = {6,5,4,3,2,1};
        int n = arr1.length;
        System.out.println("The largest element in the array is: " + largestElement.sortArr(arr1,n));
        
        int[] arr2 = {10,5,7,9,11,15};
        n = arr2.length;
        System.out.println("The largest element in the array is: " + largestElement.sortArr(arr2,n));


        
//         System.out.println("The largest element in the array is: " + largestElement.sortArr(arr1));
//         System.out.println("The largest element in the array is: " + largestElement.sortArr(arr2));
//     }

}
}
