ublic static void main(String[] args){
    int[] input = {2, 1, 5, 1, 3, 2};
    int k = 3;
    int sum = 0;

    // Step 1 — first window
    for(int i = 0; i < k; i++){
        sum += input[i];
    }

    int maxSum = sum;
    int maxStart = 0;

    // Step 2 — slide the window
    for(int i = k; i < input.length; i++){
        sum = sum + input[i] - input[i - k];
        if(sum > maxSum){
            maxSum = sum;
            maxStart = i - k + 1;
        }
    }

    int[] subArray = Arrays.copyOfRange(input, maxStart, maxStart + k);
    System.out.println("Subarray: " + Arrays.toString(subArray));
    System.out.println("Max Sum: " + maxSum);
}