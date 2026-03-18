import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterWithReplacement {

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;

        for(int right = 0; right< s.length(); right++){

            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0)+1);

            maxFreq = Math.max(maxFreq, map.get(rightChar));

            if((right - left + 1) - maxFreq > k ){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
        }
        System.out.println(maxLength);
    }
}
