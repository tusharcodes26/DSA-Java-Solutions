public class sortArrayOf0_1_2{
    
    // Brute Force
    // public void sortNum(int[] arr){
    //     int n = arr.length;
    //     int cnt0 = 0, cnt1 = 0, cnt2 = 0;

    //     for(int num : arr){
    //         if(num == 0) cnt0++;
    //         else if(num == 1) cnt1++;
    //         else cnt2++;
    //     }

    //     int index = 0;

    //     while(cnt0-- > 0){
    //         arr[index++] = 0;
    //     }
    //     while(cnt1-- > 0){
    //         arr[index++] = 1;
    //     }
    //     while(cnt2-- > 0){
    //         arr[index++] = 2;
    //     }
    // }

    // Better Solution
    // public void sortNum(int[] arr){
    //     int n = arr.length;
    //     int cnt0= 0, cnt1 = 0, cnt2 = 0;

    //     for(int num : arr){
    //         if(num == 0) cnt0++;
    //         else if(num == 1) cnt1++;
    //         else cnt2++;
    //     }

    //     for(int i = 0; i < cnt0; i++){
    //         arr[i] = 0;
    //     }
    //     for(int i = cnt0; i < cnt0 + cnt1; i++){
    //         arr[i] = 1;
    //     }
    //     for(int i = cnt0 + cnt1; i < n; i++){
    //         arr[i] = 2;
    //     }
    // }

    //Optimal Approach - Dutch National flag
    public void sortNum(int[] arr){
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        sortArrayOf0_1_2 so = new sortArrayOf0_1_2();

        int[] arr = {1,2,1,0,2,1,0,2,1,2,0,2,1,1,0};

        so.sortNum(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}