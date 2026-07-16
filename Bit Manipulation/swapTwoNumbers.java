public class swapTwoNumbers {
    public void swapXOR(int[] arr){
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }

     public static void main(String[] args) {
 
        int[] nums = {5, 10};
        System.out.println("a = " + nums[0] + ", b = " + nums[1]);

        swapTwoNumbers swap = new swapTwoNumbers();
        swap.swapXOR(nums);

        System.out.println("After Swapping");
        System.out.println("a = " + nums[0] + ", b = " + nums[1]);
    }
}
