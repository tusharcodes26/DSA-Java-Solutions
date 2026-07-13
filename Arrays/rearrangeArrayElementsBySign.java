
public class rearrangeArrayElementsBySign {
    
    // Brute Force
    // public int[] sign(int[] arr){
    //     int n = arr.length;

    //     List<Integer> pos = new ArrayList<>();
    //     List<Integer> neg = new ArrayList<>();

    //     for(int i = 0; i< n; i++){
    //         if(arr[i] > 0){
    //             pos.add(arr[i]);
    //         }
    //         else{
    //             neg.add(arr[i]);
    //         }
    //     }

    //     for(int i = 0; i < n/2; i++){
    //         arr[2*i] = pos.get(i);
    //         arr[2*i+1] = neg.get(i);
    //     }   

    //     return arr;
    // }

    //Optimal solution
    public int[] sign(int[] arr){
        int n = arr.length;
        
        int[] ans = new int[n];
        int pos = 0, neg = 1;

        for(int i = 0; i< n; i++){
            if(arr[i] < 0){
                ans[neg] = arr[i];
                neg += 2;
            }
            else{
                ans[pos] = arr[i];
                pos += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};

        rearrangeArrayElementsBySign obj = new rearrangeArrayElementsBySign();
        int[] result = obj.sign(arr);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
