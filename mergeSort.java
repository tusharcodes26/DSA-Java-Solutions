public class mergeSort{
    public static void sort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArr[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++){
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 83, 10};

        System.out.println("Before Merge Sort");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        sort(arr, 0, arr.length - 1);

        System.out.println("After Merge Sort");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}