public static void main(String[] args){
    
    int[] input = {3, -1,-4, 7, -2, 5};
    int count = 0;
    
    for(int i =0; i < input.length; i++){
        if(input[i]< 0){
            count++;
        }
    }
    System.out.println(count);
}