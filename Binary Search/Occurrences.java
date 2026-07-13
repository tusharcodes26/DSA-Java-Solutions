public class Occurrences {
    //Brute force - linear search
    // public int count(int[] arr, int x){
    //     int n = arr.length;
    //     int cnt = 0;

    //     for (int i = 0; i < n; i++) {
    //         if(arr[i] == x) cnt++;
    //     }
    //     return cnt;
    // }

    public int lastOcc(int[] arr, int x){
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

    public int firstOcc(int[] arr, int x){
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
        int fs = firstOcc(arr, x);
        if(fs == -1) return new int[]{-1,-1};
        int ls = lastOcc(arr, x);
        return new int[]{fs, ls};
    }

    public int count(int[] arr, int x){
        int[] ans = range(arr, x);
        if(ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    public static void main(String[] args) {
        int[] arr =  {1, 2, 2, 2, 3, 4, 4, 5};
        int x = 2;
        Occurrences oc = new Occurrences();
        int ans = oc.count(arr, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}
