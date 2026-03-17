public static void main(Stirng[] args){
    
    int[] arr = {1,2,3,4,5};
    
    int left = 0;
    int right = arr.length -1;
    int temp = -1;
    
    while(left < right){
        
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    
    System.out.println(Arrays.toString(arr));
}