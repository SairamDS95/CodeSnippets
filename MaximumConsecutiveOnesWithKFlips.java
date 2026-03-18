public class MaximumConsecutiveOnesWithKFlips {

    public static void main(String[] args) {
        int[] input = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;
        int left = 0;
        int maxStreak = 0;
        int zeroCount = 0;

        for(int right = 0; right<input.length ; right++){
            if(input[right] == 0){
                zeroCount++;
            }
            if(zeroCount > k){
                if(input[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            maxStreak = Math.max(maxStreak, right - left +1);
        }
        System.out.println(maxStreak);
    }
}
