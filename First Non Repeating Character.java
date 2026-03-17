public static void main(String[] args){
    
    String s = "aabbcdeef";
    
    for(Char c: s.toCharArray()){
        if(s.indexOf(c) == s.lastIndexOf(c)){
            System.out.println("First Non Repeating Character is: " + c);
            break;
        }
    }
}