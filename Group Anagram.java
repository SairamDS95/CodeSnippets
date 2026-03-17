public static void main(String[] args){
    
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    
    Map<String, ArrayList<String>> map = new HashMap<>();
    
    for(String s: input){
        
        Char[] c = s.toCharArray();
        
        Arrays.sort(c);
        
        String sortedString = new String(c);
        
        if(!map.containsKey(sortedString)){
            map.put(sortedString, new ArrayList<String>);
        }
        map.get(sortedString).add(s)
    }
    
    for(ArrayList<String> al : map.getValues()){
        System.out.println(al);
    }
    
}