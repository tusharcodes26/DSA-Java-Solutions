public class ismorphicString {
    public boolean isIsomorphic(String s, String t){

        int[] m1 = new int[256], m2 = new int[256];

        for(int i = 0; i < s.length(); i ++){
            if(m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;
            
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
          // Create instance of Solution class
        ismorphicString solution = new ismorphicString();
  
          // Define input strings
          String s = "foo";
          String t = "bar";
  
          // Check if strings are isomorphic
          if (solution.isIsomorphic(s, t)) {
              System.out.println("Strings are isomorphic.");
          } else {
              System.out.println("Strings are not isomorphic.");
          }
      }
}
