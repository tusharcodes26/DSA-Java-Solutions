
import java.util.Arrays;

public class longestCommonPrefix {
    public String prefix(String[] s){
        
        StringBuilder pre = new StringBuilder();

        Arrays.sort(s);

        String first = s[0];
        String last = s[s.length-1];

        for(int i = 0; i < Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)) 
                return pre.toString();
            
            pre.append(first.charAt(i));
        }
        return pre.toString();
    }
    public static void main(String[] args) {
        // Create an instance of Solution
        longestCommonPrefix solution = new longestCommonPrefix();

        // Input array of strings
        String[] input = {"interview", "internet", "internal", "interval"};

        // Call method to get result
        String result = solution.prefix(input);

        // Print the longest common prefix
        System.out.println("Longest Common Prefix: " + result); 
    }
}
