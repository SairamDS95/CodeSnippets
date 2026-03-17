public class AverageOfPositives {


    public static void main(String[] args) {

        int[] input = {-3, 4, -1, 6, 2, -5};
        int count = 0;
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                sum += input[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}