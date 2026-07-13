public class removeOutermostParenthesis {
    public String remove(String s){
        StringBuilder result = new StringBuilder();

        int level = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(level > 0) result.append(ch);

                level++;
            }
            else if(ch == ')'){
                level--;

                if(level > 0) result.append(ch);
            }
        }
        return result.toString();
    }

     public static void main(String[] args) {
        String s = "(()())(())";  // Example input string
        removeOutermostParenthesis sol = new removeOutermostParenthesis();

        // Get result
        String ans = sol.remove(s);

        // Print result
        System.out.println("The result is: " + ans);
    }
}
