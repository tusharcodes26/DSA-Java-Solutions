public class selectionSort {
    public static void sort(int[] arr){

        int n = arr.length;
        for(int i = 0; i <= n-1; i++){
            int min = i;

            for(int j = i; j <= n-1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2,56,89,45,34,67,26};
        
        System.out.println("Before Selection sort");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        
        sort(arr);

        System.out.println("After Selection sort");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
