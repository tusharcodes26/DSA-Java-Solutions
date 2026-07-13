
import java.util.ArrayList;
import java.util.List;

public class generateBinaryString {
    public static void generate(int n, String curr, List<String> result){
        if(curr.length() == n){
            result.add(curr);
            return;
        }

        generate(n, curr + "0", result);

        if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1'){
            generate(n, curr + "1", result);
        }
    }

    public static void main(String[] args) {
        // Input length n
        int n = 3;

        // List to store results
        List<String> result = new ArrayList<>();

        // Start recursion with empty string
        generateBinaryString.generate(n, "", result);

        // Print results
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
