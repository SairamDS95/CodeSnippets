public static void main(String[] args){
    
    int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    
    int max = Integer.MIN_VALLUE;
    int left = 0;
    int right = arr.length - 1;
    int area = 0;
    
    while(left< right){
        area = (right - left) * Math.min(arr[left], arr[right]);
        
        if(area > max){
            max = area;
        }
        
        if(arr[left] < arr[right]){
            left++;
        }else right--;
    }
    
    System.out.println(max);
    
}