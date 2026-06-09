

public class palindrome {
    public static int reverseNum(int n){

        int revNum = 0;
        int dup = n;

        while(n > 0){

            int lastDigit = n % 10;

            revNum = (revNum * 10) + lastDigit;

            n = n/10;
        }

        if(revNum == dup){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is Not a Palindrome");
        }

        return revNum;
    }

    public static void main(String[] args) {
        palindrome obj = new palindrome();

            int num = 214412;
            System.out.println(obj.reverseNum(num));
    }
}
