public class palindromeString {
    public boolean palindrome(int i, String s){

        if(i >= s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        return palindrome(i + 1, s);
    }

    public static void main(String[] args) {
        palindromeString str = new palindromeString();

        String s = "madam";

        System.out.println(str.palindrome(0, s));
    }
}
