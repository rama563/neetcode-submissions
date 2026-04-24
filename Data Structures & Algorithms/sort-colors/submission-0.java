class Solution {
    public void sortColors(int[] nums) {
        int zc=0,oc=0,tc=0;
        int l = nums.length;
        for(int i=0;i<l;i++){
            if(nums[i] == 0) zc++;
            if(nums[i] == 1) oc++;
            if(nums[i] == 2) tc++;
        }
        for(int i=0;i<zc;i++){
            nums[i] = 0;
        }
        for(int i=zc;i<zc+oc;i++){
            nums[i] = 1;
        }
        for(int i=zc+oc;i<zc+oc+tc;i++){
            nums[i] = 2;
        }
    }
}