public class minBitFlips {
    public int bitFlip(int start, int goal){
        int num = start ^ goal;

        int count = 0;

        for(int i = 0; i < 32; i++){
            count += (num & 1);
            num = num >> 1;
        }

        return count;
    }
    public static void main(String[] args) {
        minBitFlips flip = new minBitFlips();

        int start = 3, goal = 4; 
        
        int ans = flip.bitFlip(start, goal);
        
        System.out.println("The minimum bit flips to convert number is: " + ans);
    }
}
