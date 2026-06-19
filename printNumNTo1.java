public class printNumNTo1 {
    public void printNum(int n){
        if(n < 1){
            return;
        }

        System.out.println(n);
        printNum(n - 1);
        // System.out.println(n); --> For Backtracking
    }

    public static void main(String[] args) {
        printNumNTo1 obj = new printNumNTo1();
        int i = 5;
        obj.printNum(i);
    }
}
