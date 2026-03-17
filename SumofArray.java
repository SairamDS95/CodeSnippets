public class SumofArray {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5};
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            result += input[i];
        }
        System.out.println(result);
    }
}