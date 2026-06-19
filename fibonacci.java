public class fibonacci{
    public int number(int n){
        if(n <= 1){
            return n;
        }

        int last = number(n -1);
        int secLast = number(n -2);

        return last + secLast;
    }
    public static void main(String[] args) {
        fibonacci fib = new fibonacci();
        int n = 6;

        System.out.println(fib.number(n));
    }
}