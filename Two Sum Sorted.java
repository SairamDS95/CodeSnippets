public static void main(String[] args){
    
    int[] input = {2,3,7,11,15};
    
    int target = 9;
    
    int left = 0;
    int right = input.length -1;
    
    while(left < right){
    int sum = input[left] + input[right];
        if(sum == target){
            
            System.out.println(input[left] + " + " + input[right] + " = " + target);
        }else if(sum > target){
            right--;
        }else if(sum < target){
            left++;
        }
        
    }
}