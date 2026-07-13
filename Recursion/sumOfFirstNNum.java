public class sumOfFirstNNum {
    public static int sum(int n) {

        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("The Sum of First " + num + " is: " + sum(num));
    }
}
