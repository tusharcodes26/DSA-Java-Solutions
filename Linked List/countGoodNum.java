public class countGoodNum {
    static final int MOD = 1_000_000_007;

    public static int good(int index, int n){
        if(index == n) return 1;

        int result = 0;

        if(index % 2 == 0){
            int[] evenDigits = {0, 2, 4, 6, 8};
            for(int digit : evenDigits){
                result = (result + good(index + 1, n)) % MOD;
            }
        }
        else {
            int[] primeDigits = {2, 3, 5, 7};
            for(int digit : primeDigits){
                result = (result + good(index + 1, n)) % MOD;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(good(0, n));
    }
}
