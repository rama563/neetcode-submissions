class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int [] arr1 = new int[l+l];
        for(int i=0;i<l;i++){
            arr1[i] = nums[i];
        }    
        for(int i=0;i<l;i++){
            arr1[i+l] = nums[i];
        }
        return arr1;
    }
}