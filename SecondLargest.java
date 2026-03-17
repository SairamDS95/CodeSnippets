public class SecondLargest {

    public static void main(String[] args) {

        int[] input = {4, 1, 7, 3, 9, 2};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                secondMax = max;
                max = input[i];
            } else if (input[i] > secondMax && input[i] < max) {
                secondMax = input[i];
            }
        }
        System.out.println(secondMax);
    }
}