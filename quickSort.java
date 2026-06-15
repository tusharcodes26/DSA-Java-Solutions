
import java.util.Arrays;

public class quickSort {
    public static int partition(int[] arr, int low, int high){
        
        int pivot = arr[high];
        
        int i = low - 1;
        
        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i+1, high);
        
        return i + 1;
    }
    
    public static void sort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    
    
    private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Quick Sort");
        System.out.println(Arrays.toString(arr));
        
        quickSort.sort(arr, 0, arr.length - 1);
        
        System.out.println("After Quick Sort");
        System.out.println(Arrays.toString(arr));
    }
}