public class floorAndCeil{
    public int[] getFloorAndCeil(int[] nums, int x) {
        int f = findFloor(nums, x);
        int c = findCeil(nums, x);

        return new int[]{f,c};
    }

    public int findFloor(int[] nums, int x){

       int n = nums.length;
       int low = 0, high = n - 1;
       int ans = -1;

       while(low <= high){
        int mid = (low + high) / 2;
        if(nums[mid] <= x){
            ans = nums[mid];
            low = mid+1;
        }
        else{
            high = mid - 1;
        }
       }
       return ans;
    }

    public int findCeil(int[] nums, int x){
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] >= x){
                ans = nums[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
            return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        floorAndCeil finder = new floorAndCeil();
        int[] res = finder.getFloorAndCeil(arr, x);
        System.out.println("The floor and ceil are: " + res[0] + " and " + res[1]);
    }
}