import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDifferentCharacter {

    public static void main(String[] args) {

        String s = "araaci";
        int k = 2;

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;


        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while (map.get(s.charAt(right)) > 1) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);

    }

}
