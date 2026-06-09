public class pattern11 {
    public static void main(String[] args) {
        
        for(int i = 1; i<=5; i++){

            int num = i % 2;

            for(int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num = 1 - num;
            }

            System.out.println();
        }
    }
}
