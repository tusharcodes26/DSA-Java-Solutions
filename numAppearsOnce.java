public class numAppearsOnce {
    
    //Brute Force
    // public int getElement(int[] arr){
    //     int n = arr.length;

    //     for(int i = 0; i < n; i++){
    //         int num = arr[i];
    //         int cnt = 0;

    //         for(int j = 0; j < n; j++){
    //             if(arr[j] == num){
    //                 cnt++;
    //             }
    //         }

    //         if(cnt == 1) return num;
    //     }
    //     return -1;
    // }

    // Better Approach
    // public int getElement(int[] arr){
    //     int n = arr.length;

    //     int maxi = 0;
    //     for(int i = 0; i < n; i++){
    //         maxi = Math.max(maxi, arr[i]);
    //     }
        
    //     int[] hash = new int[maxi + 1];
    //     for(int i = 0; i < n; i++){
    //         hash[arr[i]]++;
    //     }

    //     for(int i = 0; i < n; i++){
    //         if(hash[arr[i]] == 1){
    //             return arr[i];
    //         }
    //     }

    //     return -1;
    // }

    // Optimal Approach
    public int getElement(int[] arr){

        int xor = 0;

        for(int num : arr){
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 4, 1, 5, 2};

        numAppearsOnce obj = new numAppearsOnce();
        int ans = obj.getElement(arr);

        System.out.println("The single element is: " + ans);
    }
}
