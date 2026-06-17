public class maxConsecutiveOnes {
    public int count(int[] arr){

        int n = arr.length;
        int cnt = 0;
        int maxi = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                cnt++;
                maxi = Math.max(maxi, cnt);
            }
            else{
                cnt = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,1};

        maxConsecutiveOnes obj = new maxConsecutiveOnes();

        System.out.println(obj.count(arr));
    }
}
