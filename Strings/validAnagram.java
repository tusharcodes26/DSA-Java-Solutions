
import java.util.Arrays;

public class validAnagram {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for(int i = 0; i < s.length(); i++){
            if(charArray1[i] != charArray2[i]){
                return false;
            }
        }
        return true;
    }

     public static void main(String[] args) {
        validAnagram ana = new validAnagram();
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";

        if (ana.isAnagram(Str1, Str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}