
import java.util.HashSet;
import java.util.Set;



public class longestConsecutiveSequence {
    
    // Brute Force
    // private boolean linearSearch(int[] arr, int num){
    //     int n = arr.length;

    //     for(int i = 0; i < n; i++){
    //         if(arr[i] == num){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public int sequence(int[] arr){
    //     int n = arr.length;

    //     if(n == 0){
    //         return 0;
    //     }

    //     int longest = 1;

    //     for(int i = 0; i < n; i++){
    //         int x = arr[i];
    //         int cnt = 1;

    //         while(linearSearch(arr, x+1) == true){
    //             x++;
    //             cnt++;
    //         }
    //         longest = Math.max(longest, cnt);
    //     }
    //     return longest;

    // }

    // Better approach
    // public int sequence(int[] arr){
    //     int n = arr.length;
    //     if(n == 0) return 0;

    //     Arrays.sort(arr);

    //     int last = Integer.MIN_VALUE;
    //     int cnt = 0;
    //     int longest = 1;

    //     for(int i = 0; i < n; i++){
    //         if(arr[i] - 1 == last){
    //             cnt++;
    //             last = arr[i];
    //         }
    //         else if(arr[i] != last){
    //             cnt = 1;
    //             last = arr[i];
    //         }
    //         longest = Math.max(longest, cnt);
    //     }
    //     return longest;
    // }

    //Optimal Approach
    public int sequence(int[] arr){
        int n = arr.length;

        if(n == 0) return 0;

        int longest = 1;
        
        Set<Integer> st = new HashSet<>();

        for(int i = 0; i < n; i++){
            st.add(arr[i]);
        }

        for(int it : st){
            if(!st.contains(it - 1)){
                int cnt = 1;

                while(st.contains(it + 1)){
                    it++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        longestConsecutiveSequence solution = new longestConsecutiveSequence();

        int ans = solution.sequence(arr);
    
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
