
public class kokoEatingBananas{

    private int max(int[] arr){
        int n = arr.length;
        int maxi = arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public int totalHour(int[] piles, int speed){
        int hr = 0;
        for(int bananas : piles){
            hr += (int)Math.ceil((double)bananas/speed);
        }
        return hr;
    }

    public int banana(int[] arr, int h){
        int n = arr.length;
        // int maxPile= Arrays.stream(arr).max().getAsInt();
        int maxPile = max(arr);
        int low = 0;
        int high = maxPile;
        while(low<=high){
            int mid = (low+high)/2;
            int hr = totalHour(arr, mid);
            if(hr<=h){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return low;
    }

     public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11, 12};
        int h = 8;

        kokoEatingBananas obj = new kokoEatingBananas();
        System.out.println(obj.banana(piles, h));
    }
}