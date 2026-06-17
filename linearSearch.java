public class linearSearch {
    public int search(int[] arr, int n, int num){

        for(int i = 0; i < n; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        linearSearch ls = new linearSearch();
        int[] arr = {4,6,6,5,7,4,3,1,3,5};
        int num = 3;
        int n = arr.length;

        int val = ls.search(arr, n,num);

        System.out.println(val);
    }
}
