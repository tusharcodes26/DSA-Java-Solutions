public class squareroot {
    public int mySqrt(int n){
        if(n < 2) return 2;

        int low = 1, high = n;
        int ans = 1;

        while(low <= high){
            long mid = (low + high)/2;

            if((mid * mid * mid) <= n){
                ans = (int)mid;
                low = (int)mid + 1;
            }
            else high = (int)mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        squareroot s = new squareroot();
        System.out.println(s.mySqrt(125));
    }
}
