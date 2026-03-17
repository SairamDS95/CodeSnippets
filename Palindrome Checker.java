public static boolean isPalindrome(){
    
    String input = "racecar";
    boolean is Palindrome = true;
    int left = 0;
    int right = input.length()-1;
    
    while(left < right){
        
        if(input.charAt(left) != input.charAt(right)){
            return isPalindrome = false;
            break;
        }
        return isPalindrome;
    }
    
}