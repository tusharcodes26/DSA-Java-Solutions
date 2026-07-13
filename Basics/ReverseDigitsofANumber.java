public class ReverseDigitsofANumber {
    public int reverseDigits(int n){
        
        int revNum = 0;

        while(n > 0){
            int lastDigit = n % 10;

            revNum = revNum * 10 + lastDigit;

            n = n/10;
        }
        
        return revNum;
    }

    public static void main(String[] args) {
        ReverseDigitsofANumber obj = new ReverseDigitsofANumber();

        int num =14700;

        System.out.println(obj.reverseDigits(num));
    }
}
