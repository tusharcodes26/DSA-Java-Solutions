public class factorial {
    public static int multi(int n) {

        if (n == 1)
            return 1;
        else
            return n * multi(n - 1);

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("The Factorial of " + num + " is: " + multi(num));
    }
}
