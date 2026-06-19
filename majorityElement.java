

public class majorityElement {
    
    // Brute Force
    // public int most(int[] arr){
    //     int n = arr.length;

    //     for(int i = 0; i < n; i++){

    //         int cnt = 0;
    //         for(int j = 0; j < n; j++){
    //             if(arr[j] == arr[i]){
    //                 cnt++;
    //             }
    //         }
    //         if(cnt > (n/2)){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    // Better Approach - HashMap
    // public int most(int[] arr){
    //     int n = arr.length;

    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int num : arr){
    //         map.put(num, map.getOrDefault(num, 0) + 1);
    //     }

    //     for(Map.Entry<Integer, Integer> entry :map.entrySet()){

    //         if(entry.getValue() > n/2){
    //             return entry.getKey();
    //         }
    //     }
    //     return -1;
    // }

    // Optimal Solution - Moore's Voting System
    public int most(int[] arr){
        int n = arr.length;
        int el = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(cnt == 0){
                cnt = 1;
                el = arr[i];
            }
            else if(el == arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == el) cnt1++;
        }
        if(cnt1 > n/2) return el;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,1,1};
        
        majorityElement sol = new majorityElement();
 
        int ans = sol.most(arr);
        
        System.out.println("The majority element is: " + ans);
    }
}
