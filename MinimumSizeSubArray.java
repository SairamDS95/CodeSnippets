public class MinimumSizeSubArray {

    public static void main(String[] args) {
        int[] input = {2,3,1,2,4,3};
        int target = 7;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for(int right = 0; right < input.length; right++){

            sum += input[right]; // 2+3+1+2 = 8

            while(sum >= target){ // 8 > 7
                Math.min(minLength, right - left +1);
                sum -= input[left]; // 3+1+2 = 5
                left++;
            }
        }
        System.out.println(minLength);
    }
}
