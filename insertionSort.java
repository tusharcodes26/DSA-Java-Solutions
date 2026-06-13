public class insertionSort {
    public static void sort(int[] arr){

        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int j = i;
            while (j > 0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
                System.out.println("Swapped");
        }
    }

        System.out.println("After Bubble sort");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        
        insertionSort sorter = new insertionSort();

        System.out.println("Before Bubble sort");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        
        sorter.sort(arr);
    }
}
