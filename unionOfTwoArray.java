
import java.util.ArrayList;
import java.util.List;

public class unionOfTwoArray {

    // Using Set
    // public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
    //     TreeSet<Integer> set = new TreeSet<>();
        
    //     for(int i = 0; i< n; i++){
    //         set.add(arr1[i]);
    //     }
    //     for(int i = 0; i< m; i++){
    //         set.add(arr2[i]);
    //     }
    //     return new ArrayList<>(set);
    // }

    // Using Hash Map

    // public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
    //     Map<Integer, Integer> map = new HashMap<>();

    //     for(int i = 0; i < n; i++){
    //         map.put(arr1[i], 1);
    //     }
    //     for(int i = 0; i < m; i++){
    //         map.put(arr2[i], 1);
    //     }

    //     return new ArrayList<>(map.keySet());

    // }

    // Optimal Solution

    public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n){
            if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
        }
        while(j < n){
            if(union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,8,9,10,5,4,6};
        int n = arr1.length;
        int m = arr2.length;

        System.out.println("Arrays 1: ");
        for(int num : arr1){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Array 2: ");
        for(int num : arr2){
            System.out.print(num + " ");
        }
        System.out.println();
        unionOfTwoArray obj = new unionOfTwoArray();
        List<Integer> union = obj.findUnion(arr1, arr2, n, m);

        System.out.println("Union of Array 1 and Array 2 is: ");
        for(int num : union){
            System.out.print(num + " ");
        }
    }
}
