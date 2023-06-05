package in.dsa.firstuniqchar;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {


    public int firstUniqChar(String s) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Iterate through the string to find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // No unique character found
        return -1;
    }

    public static void main(String[] args) {
    	FirstUniqChar fuc = new FirstUniqChar();

        String s1 = "leetcode";
        int result1 = fuc.firstUniqChar(s1);
        System.out.println("Input: " + s1);
        System.out.println("Output: " + result1);

        String s2 = "loveleetcode";
        int result2 = fuc.firstUniqChar(s2);
        System.out.println("Input: " + s2);
        System.out.println("Output: " + result2);

        String s3 = "aabb";
        int result3 = fuc.firstUniqChar(s3);
        System.out.println("Input: " + s3);
        System.out.println("Output: " + result3);
    }
}