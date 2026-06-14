public class recursiveInsertionSort {
    public static void sort(int[] arr, int i, int n){

        if(i == n) return;

        int j = i;
        while (j > 0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        sort(arr, i+1, n);
    }
    
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int n = arr.length;
    
    
    System.out.println("Before recursive insertion sort");
    for(int num : arr){
        System.out.print(num + " ");
    }
    System.out.println();
    
    recursiveInsertionSort.sort(arr, 0, n);

    System.out.println("After recursive insertion sort");
    for(int num : arr){
        System.out.print(num + " ");
    }
    System.out.println();
    }
}
