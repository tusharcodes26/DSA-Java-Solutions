import java.util.Scanner;

public class hashing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Give a size of an array: ");
        n = sc.nextInt();
        System.out.println("Give an array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //precompute
        System.out.println("how many numbers do you want to find in an array: ");
        int[] hash = new int[6];
        for(int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt();
        System.out.println("What numbers do you want to find in an array: ");
        while(q-- != 0){
            int number;
            number = sc.nextInt();
            //fetching:
            System.out.println(hash[number]);
        }

    }
}