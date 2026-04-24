class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(String s : strs){
            while(s.indexOf(str)!=0){
                str = str.substring(0,str.length() -1);
            }
        }
        return str;
    }
}