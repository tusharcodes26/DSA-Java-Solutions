public class recursiveBubbleSort {
    public static void bubbleSort(int[] arr){
        
        int n = arr.length;
        if(n == 1){
            return;
        }

        boolean didSwap = false;

        for(int i = 0; i <= n - 2; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                didSwap = true;
            }
        }

        if(!didSwap) return;

        bubbleSort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};

        System.out.println("Before Recursive Bubble Sort");
        
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        
        bubbleSort(arr);
        
        System.out.println("After Recursive Bubble Sort");
        
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
}
