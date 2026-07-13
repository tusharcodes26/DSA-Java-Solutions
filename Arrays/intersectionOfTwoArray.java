import java.util.ArrayList;
import java.util.List;

public class intersectionOfTwoArray {
    public List<Integer> findIntersection(int[] arr1, int[] arr2, int n, int m){
        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i<n && j<n){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] < arr1[i]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
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
        intersectionOfTwoArray obj = new intersectionOfTwoArray();
        List<Integer> union = obj.findIntersection(arr1, arr2, n, m);

        System.out.println("Union of Array 1 and Array 2 is: ");
        for(int num : union){
            System.out.print(num + " ");
        }
    }
}
