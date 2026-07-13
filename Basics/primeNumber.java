public class primeNumber {
    public boolean getPrime(int n){

        int cnt = 0;

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                cnt ++;
            }
        }

        return cnt == 2;
        
    }

    public static void main(String[] args) {
        primeNumber num = new primeNumber();
        int n = 2;

        boolean isPrime = num.getPrime(n);

        if(isPrime){
            System.out.println(n + " is a Prime Number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
    }
}
