import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        twoSum();
    }

    public static int[] twoSum() {

        int[] input = {2, 7, 15, 11};
        int target = 9;
        int complement = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            complement = target - input[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(input[i], i);
        }
        return new int[]{-1, -1};
    }
}