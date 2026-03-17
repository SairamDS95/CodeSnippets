import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3};
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println(map.get(max));
    }
}