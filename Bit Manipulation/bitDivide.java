public class bitDivide {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == 1) return dividend;

        boolean isPositive = !((dividend > 0 && divisor < 0) ||
                                (dividend < 0 && divisor > 0));

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);

        long ans = 0;
        
        while(n >= d){
            
            long cnt = 0;
            while(n >= (d << (cnt + 1))){
                cnt++;

            }
                ans +=  (1L << cnt);
                n -= (d << cnt);
        }

        ans = isPositive ? ans : -ans;

        if(ans > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(ans < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return (int) ans;
    }

     public static void main(String[] args) {
        int dividend = 10, divisor = 3;
    
        bitDivide sol = new bitDivide();
        
        int ans = sol.divide(dividend, divisor);
        
        System.out.println("The result of dividing " 
                           + dividend + " and " 
                           + divisor + " is " + ans);
    }
}
