import java.util.HashMap;
import java.util.Scanner;

public class charHashMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Frequency map for characters
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        System.out.print("How many characters to check?");
        int q = sc.nextInt();

        System.out.println("\nFrequencies:");
        while (q-- > 0) {
            char ch = sc.next().charAt(0);
            System.out.println(ch + " -> " + mp.getOrDefault(ch, 0));
        }
    }
}