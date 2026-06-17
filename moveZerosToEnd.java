// Brute Force Approach

// public class moveZerosToEnd {
//     public int[] move(int[] arr, int n){

//         int[] temp = new int[n];
//         int index = 0;
        
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] != 0){
//                 temp[index] = arr[i];
//                 index++;
//             }
//         }

//         for(int i = 0; i < n; i++){
//             arr[i] =temp[i];
//         }

//         return arr;
//     }
// }

// Optimal Solution

public class moveZerosToEnd{
    public void move(int[] arr){
        int j = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;

                break;
            }
        }

        if(j == -1) return;

        for(int i = j + 1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {
        
        moveZerosToEnd sol = new moveZerosToEnd();
        
        int[] arr = {1,2,0,3,0,1,2,0,5,4};

        sol.move(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
