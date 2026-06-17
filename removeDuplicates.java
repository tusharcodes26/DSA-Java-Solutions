public class removeDuplicates {
    public int dupli(int[] arr, int n){
        
        if (arr.length == 0) return 0;
        
        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,4,4,4};
        int n = arr.length;

        removeDuplicates obj = new removeDuplicates();

        int k = obj.dupli(arr, n);

        System.out.println("Unique count: " + k);
        System.out.println("Array after removing duplicates: ");
        for(int x = 0; x < k; x++){
            System.out.print(arr[x] + " ");
        }


    }
}
