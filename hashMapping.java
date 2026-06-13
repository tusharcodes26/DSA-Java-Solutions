import java.util.HashMap;
import java.util.Scanner;

public class hashMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }



        //Precompute
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(mp.containsKey(key)) freq = mp.get(key); //fetching from the map
            freq++;
            mp.put(key, freq); //Inserting into the map
        }

        // for(Map.Entry<Integer, Integer> it : mp.entrySet()){
        //     System.out.println(it.getKey() + "->" + it.getValue());
        // }

        int q;
        System.out.println("Enter the number of queries: ");
        q = sc.nextInt();
        while(q-- > 0){
            int number;
            System.out.println("Enter a number to check: ");
            number = sc.nextInt();
            //fetch
            if(mp.containsKey(number)) System.out.println(mp.get(number));
            else System.out.println(0);
        }
    }
}
