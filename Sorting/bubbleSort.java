public class bubbleSort {
    public static void sort(int[] arr){

        int n = arr.length;
        for(int i = n-1; i >= 0; i--){
            boolean didSwap = false;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap){
                return;
            }
            System.out.println("Swaped");
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        // int[] arr = {1,2,3,4,5,6};

        System.out.println("Before Bubble sort");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        
        sort(arr);

        System.out.println("After Bubble sort");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
