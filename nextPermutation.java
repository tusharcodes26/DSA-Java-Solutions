public class nextPermutation {
    public void next(int[] arr){
        int n = arr.length;
        int index = -1;

        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(arr, 0, n - 1);
            return;
        }

        for(int i = n - 1; i > index; i--){
            if(arr[i] > arr[index]){
                swap(arr, i, index);
                break;
            }
        }

        reverse(arr, index + 1, n - 1);
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 0, 0, 3};
        nextPermutation sol = new nextPermutation();
        sol.next(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
