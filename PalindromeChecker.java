public class PalindromeChecker {


    public static void main(String[] args) {
        isPalindrome();
    }

    public static boolean isPalindrome() {

        String input = "racecar";
        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

        }
        return isPalindrome;
    }
}