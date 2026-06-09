public class greatestCommonDivisor {
    public static int findGcd(int a, int b){

        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a == 0){
            return b;
        }
        else{
            return a;
        }
    }

    public static void main(String[] args) {
        greatestCommonDivisor obj = new greatestCommonDivisor();
        int n1 = 49, n2 = 42;
        int gcd = findGcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
    
}
