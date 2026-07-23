import java.util.Stack;

public class trappingWater {
    // public int trap(int[] height){
    //     int n = height.length;

    //     int totalWater = 0;

    //     for(int i = 0;i < n; i++){
    //         int maxLeft = 0;
    //         int maxRight = 0;

    //         for(int j = 0; j <= i; j++){
    //             if(height[j] > maxLeft){
    //                 maxLeft = height[j];
    //             }
    //         }
    //         for(int j = i; j < n; j++){
    //             if(height[j] > maxRight){
    //                 maxRight = height[j];
    //             }
    //         }

    //         totalWater += Math.min(maxLeft, maxRight) - height[i];
    //     }
    //     return totalWater;
    // }

    public int trap(int[] height){
        Stack<Integer> st = new Stack<>();
        int water = 0;

        for(int i = 0; i < height.length; i++){
            while(!st.isEmpty() && height[i] > height[st.peek()]){
                int bottom = st.pop();

                if(st.isEmpty()) break;

                int left = st.peek();
                int width = i - left - 1;

                int boundedHeight = Math.min(height[left], height[i]) - height[bottom];

                water += width * boundedHeight;
            }
            st. push(i);
        }
        return water;
    }

     public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        trappingWater sol = new trappingWater();
        int result = sol.trap(height);
        System.out.println("Trapped Rainwater: " + result);
    }

}
