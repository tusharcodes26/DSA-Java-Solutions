public class firstAndLastOccurence {

    public int lower(int[] arr, int x){
        int n = arr.length;
        int low = 0, high = n - 1;
        int last = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return last;
    }

    public int upper(int[] arr, int x){
        int n = arr.length;
        int low = 0, high = n - 1;
        int first = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return first;
    }

    public int[] range(int[] arr, int x){
        
        int fs = upper(arr, x);
        if(fs == -1) return new int[]{-1,-1};
        int ls = lower(arr, x);
        return new int[]{fs, ls};
    }
    
    public static void main(String[] args) {
        firstAndLastOccurence obj = new firstAndLastOccurence();

        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5};
        int x = 2;

        int[] result = obj.range(arr, x);

        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
}
