
import java.util.ArrayList;
import java.util.List;

public class combinationSum3{
    public void func(int sum, int last, List<Integer> nums, int k, List<List<Integer>> ans){
        if(sum == 0 && nums.size() == k){
            ans.add(new ArrayList<>(nums));
            return;
        }

        if(sum <= 0 && nums.size() > k) return;

        for(int i = last; i <= 9; i++){
            if(i <= sum){
                nums.add(i);
                func(sum - i, i + 1, nums, k, ans);
                nums.remove(nums.size() - 1);
            }
            else{
                break;
            }
        }
    }
     public List<List<Integer>> combination(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        func(n, 1, nums, k, ans);
        return ans;
    }
    public static void main(String[] args) {
        combinationSum3 sol = new combinationSum3();
        int k = 3; // Number of elements in the combination
        int n = 7; // Target sum
        List<List<Integer>> result = sol.combination(k, n);

        for (List<Integer> combination : result) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}