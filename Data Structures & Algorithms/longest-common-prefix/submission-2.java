class Solution {
    public String longestCommonPrefix(String[] strs) {
        String dup = strs[0];
        for(String str : strs){
            while(str.indexOf(dup) !=0){
                dup = dup.substring(0,dup.length()-1);
            }
        }
        return dup;
    }
}