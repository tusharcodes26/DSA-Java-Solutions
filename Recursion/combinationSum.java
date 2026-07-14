
import java.util.ArrayList;
import java.util.List;

public class combinationSum{
    public void func(int ind, int target, int[] arr, List<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind] <= target){
            ds.add(arr[ind]);
            func(ind, target - arr[ind], arr, ans, ds);
            ds.remove(ds.size() - 1);
        }

        func(ind + 1, target, arr, ans, ds);
    }

    public List<List<Integer>> combination(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        func(0, target, candidates, ans, ds);
        return ans;
    }

    public static void main(String[] args) {
        combinationSum obj = new combinationSum();
        int[] v = {2, 3, 6, 7};  // Candidate numbers
        int target = 7;  // Target sum

        // Get all combinations
        List<List<Integer>> ans = obj.combination(v, target);

        // Output the combinations
        System.out.println("Combinations are: ");
        for (List<Integer> combination : ans) {
            for (int num : combination) {
                System.out.print(num + " ");  // Print each element of the combination
            }
            System.out.println();  // Print a newline after each combination
        }
    }
}