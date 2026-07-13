import java.util.HashMap;

public class freqCounter {
    public void frequency(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = n;

        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();

            if(count > maxFreq){
                maxFreq = count;
                maxEle = element;
            }

            if(count < minFreq){
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

    public static void main(String[] args) {
        freqCounter fc = new freqCounter();
        int[] arr = {10, 5, 10 ,15, 10, 5};
        fc.frequency(arr, arr.length);
    }
}
