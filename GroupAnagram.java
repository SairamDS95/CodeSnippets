import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : input) {

            char[] c = s.toCharArray();

            Arrays.sort(c);

            String sortedString = new String(c);

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }

        for (ArrayList<String> al : map.values()) {
            System.out.println(al);
        }

    }
}