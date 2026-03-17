public static void main(String[] args){
    
    int[] input = {1, 1, 1, 2, 2, 3}, k= 2;
    
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int num: input){
        map.put(input, map.getOrDefault(num, 0)+1);
    }
    
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
    
    list.sort((a,b) ->b.getValue() - a.getValue());
    
    for(int i = 0; i < k; i++){
        System.out.println(list.get(i))
    }
}