public class cntSetBits {
    public int setBits(int n){
        int count = 0;

        while(n > 0){
            n &= (n - 1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 39;

        cntSetBits sol = new cntSetBits();
        int result = sol.setBits(n);

        System.out.println("The number of set bits is: " + result);
    }
}
