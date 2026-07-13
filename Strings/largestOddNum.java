public class largestOddNum {
    public String odd(String s){

        int ind = -1;
        int i;
        for(i = s.length() - 1; i >= 0; i--){
            if((s.charAt(i) - '0') % 2 == 1){
                ind = i;
                break;
            }
        }
        if(ind == -1) return "";
        
        i = 0;
        while(i <= ind && s.charAt(i) == '0') i++;

        return s.substring(i, ind+1);
    }

    public static void main(String[] args) {
        largestOddNum solution = new largestOddNum();
        String num = "52";
        String result = solution.odd(num);
        System.out.println("Largest odd number: " + result);
    }
}
