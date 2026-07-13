

public class stockBuyAndSell{

    //Brute force
    // public int stock(int[] arr){
    //     int n = arr.length;
    //     int maxProfit = 0;

    //     for(int i = 0; i < n; i++){
    //         for(int j = i + 1; j < n; j++){
    //                 int profit = arr[j] - arr[i];

    //                 maxProfit = Math.max(maxProfit, profit);
    //         }
    //     }

    //     return maxProfit;
    // }

    //Optimal Approach;

    public int stock(int[] arr){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : arr){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                maxProfit = Math.max(maxProfit,price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        stockBuyAndSell sol = new stockBuyAndSell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + sol.stock(prices));
    }
}