public class bitDivide {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == 1) return dividend;

        boolean isPositive = !((dividend > 0 && divisor < 0) ||
                                (dividend < 0 && divisor > 0));

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);

        long res = 0;
        
        while(n >= d){
            
            long cnt = 0;
            while(n >= (d << (cnt + 1))){
                cnt++;

            }
                res +=  (1L << cnt);
                n -= (d << cnt);
        }

        res = isPositive ? res : -res;

        if(res > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(res < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return (int) res;
    }

     public static void main(String[] args) {
        int dividend = 10, divisor = 3;
    
        bitDivide sol = new bitDivide();
        
        int res = sol.divide(dividend, divisor);
        
        System.out.println("The result of dividing " 
                           + dividend + " and " 
                           + divisor + " is " + res);
    }
}
