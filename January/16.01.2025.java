class Solution {
    public int maxLen(int[] arr) {
        
        int count = 0;
        int o = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        ginning
        map.put(0, -1);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                o++;
            } else {
                o--;
            }
            
          
            if (map.containsKey(o)) {
                count = Math.max(count, i - map.get(o));
            } else {
                
                map.put(o, i);
            }
        }
        return count;
    }
}
