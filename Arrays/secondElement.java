

public class secondElement{

    public static int secondSmallest(int[] arr, int n){
        if(n < 2){
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < sSmallest && arr[i] > smallest){
                sSmallest = arr[i];
            }
        }

        return sSmallest;
    }

    public static int secondLargest(int[] arr, int n){

        if(n < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > sLargest && arr[i] < largest){
                sLargest = arr[i];
            }
        }

        return sLargest;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,4,7,7,5};

        int n = arr.length;

        int sS = secondElement.secondSmallest(arr, n);
        int sL = secondElement.secondLargest(arr, n);

        System.out.println("Second Smallest element: " + sS);
        System.out.println("Second Largest element: " + sL);
    }
    
}