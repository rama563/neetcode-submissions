class Solution {
    public boolean isAnagram(String st, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char s : st.toCharArray()){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(char s : t.toCharArray()){
            map.put(s,map.getOrDefault(s,0)-1);
        }
        for(int i : map.values()){
            if(i!=0) return false;
        }
        return true;
        
    }
}
