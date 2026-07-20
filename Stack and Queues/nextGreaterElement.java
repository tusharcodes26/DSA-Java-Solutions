import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {
    public int[] nge(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int x : nums2){
            while(!stack.isEmpty() && stack.peek() < x){
                map.put(stack.pop(), x);
            }
            stack.push(x);
        }

        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        nextGreaterElement sol = new nextGreaterElement();
        int[] ans = sol.nge(nums1, nums2);

        for (int x : ans) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
