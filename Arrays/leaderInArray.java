
import java.util.ArrayList;

public class leaderInArray {

    // Brute force
    // public ArrayList<Integer> lead(int[] arr){
    //     int n = arr. length;
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     for(int i = 0; i < n; i++){
    //         boolean leader = true;

    //         for(int j = i + 1; j < n; j++){
    //             if(arr[j] >= arr[i]){
    //                 leader = false;
    //                 break;
    //             }
    //         }

    //         if(leader){
    //             ans.add(arr[i]);
    //         }
    //     }
    //     return ans;
    // }

    // Optimal Approach
    public ArrayList<Integer> lead(int[] arr){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        int max = arr[n-1];
        ans.add(arr[n-1]);

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        // Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = {10, 22, 12, 3, 0, 6};
        int[] arr = {5,4,3,2,1};


        leaderInArray sol = new leaderInArray();

        ArrayList<Integer> ans = sol.lead(arr);

        System.out.println("Leader in an array: ");
        for(int num : ans){
            System.out.print(num + " ");
        }


    }
}
