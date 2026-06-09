public class armstrongNum {
    public static int find(int num){
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;

        while(n > 0){
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, k);

            n /= 10;
        }
        if(sum == num){
            System.out.println("It is an Armstrong Number");
        }
        else{
            System.out.println("It is not an Armstrong Number");
        }

        return sum;
    }

    public static void main(String[] args) {
        armstrongNum obj = new armstrongNum();

        int num = 153;

        System.out.println(find(num));
    }
    
}
