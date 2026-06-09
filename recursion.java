public class recursion {
    public static void printName(int n) {
        if (n > 5) {
            return;
        }
        System.out.println("Tushar");

        printName(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printName(n);
    }
}