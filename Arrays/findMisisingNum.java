public class findMisisingNum {
    
    // Brute Force
    // public static int missing(int[] arr){
    //     int n = arr.length + 1;

    //     for(int i = 1; i <= n; i++){
    //         boolean found = false;
    //         for(int j = 0; j < n - 1; j++){
    //             if(arr[j] == i){
    //                 found = true;
    //                 break;
    //             }
    //         }

    //         if(!found)
    //             return i;
    //     }
    //     return -1;
    // }


    // Optimal Solution 1
    // public static int missing(int[] arr){
    //     int n = arr.length + 1;
    //     int expected = n * (n + 1) / 2;
    //     int actual = 0;
    //     for(int value : arr){
    //         actual = actual + value;
    //     }
    //     return expected - actual;
    // }

    // Optimal Solution 2
    public static int missing(int[] arr){
        int n = arr. length + 1;
        int xor1 = 0;
        int xor2 = 0;

        for(int i = 0; i <= n; i++){
            xor1 ^= i;
        }

        for(int i = 0; i < n - 1; i++){
            xor2 ^= arr[i];
        }

        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        int[] arr = {8,2,4,5,3,6,1};
        System.out.println(findMisisingNum.missing(arr));
    }
}
