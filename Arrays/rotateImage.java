public class rotateImage {
    
    // Brute Force
    // public int[][] rotated(int[][] matrix){
    //     int n = matrix.length;

    //     int[][] rotated = new int[n][n];

    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j < n; j++){
    //             rotated[j][n-i-1] = matrix[i][j];
    //         }
    //     }
    //     return rotated;
    // }

    //Optimal Approach
    public void rotated(int[][] matrix){
        int n = matrix.length;

        for(int i =0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            
             while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
        }
    }
}
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateImage rot = new rotateImage();
        rot.rotated(matrix);

        for(int[] num : matrix){
            for(int nums : num)
                System.out.print(nums + " ");
            System.out.println();
        }   
    }
}
