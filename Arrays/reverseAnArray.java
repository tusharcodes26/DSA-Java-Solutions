public class reverseAnArray {
    public void array(int[] arr){
        int p1 = 0;
        int p2 = arr.length - 1;

        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
            
        }
    }

    public static void main(String[] args){

        reverseAnArray obj = new reverseAnArray();

        int[] arr = {1,2,3,4,5};

        obj.array(arr);

        for(int num : arr )
        System.out.print(num + " ");

    }
}
