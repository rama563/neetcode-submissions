class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        n = n/2;
        Arrays.sort(nums);
        return nums[n];
    }
}