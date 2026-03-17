public class LongestStreak {

    public static void main(String[] args) {

        int[] input = {1, 1, 2, 3, 3, 3, 1, 1};
        int currentElement = input[0];
        int currentStreak = 0;
        int longestStreak = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] == currentElement) {
                currentStreak++;
            } else {
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
                currentStreak = 0;
                currentElement = input[i];
            }
        }
        System.out.println(longestStreak);

    }
}