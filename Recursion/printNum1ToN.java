public class printNum1ToN {
    public void printNum(int curr, int n){
        if(curr > n){
            return;
        }
        System.out.println(curr);
        printNum(curr + 1, n);
        // System.out.println(n); --> For Backtracking
    }

        public static void main(String[] args){
            printNum1ToN obj = new printNum1ToN();
            int n = 5;
            obj.printNum(1, n);
        }
}