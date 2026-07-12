import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;

public class divisor {
    public List<Integer> getDivisor(int N){
        
        List<Integer> res = new ArrayList<>();

        for(int i =1; i <= sqrt(N); i++){
            if(N % i == 0){
                res.add(i);
            }

            if(i != N/i){
                res.add(N/i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        divisor div = new divisor();

        int N = 36;

        List<Integer> result = div.getDivisor(N);

        System.out.println("Divisor of " + N + ": ");
        for(int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
