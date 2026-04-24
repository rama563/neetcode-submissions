class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length;
        HashSet<Integer> set= new HashSet<>();
        for(int i : nums){
            if(set.contains(i))
                return true;
            
            set.add(i);
        }
        return false;
    }
}