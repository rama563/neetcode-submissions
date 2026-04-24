class Solution {
    void mergeSort(int nums[], int left, int mid,int right){
        int l = left;
        int r = mid + 1;
        int[]temp = new int[right - left + 1];
        int i = 0;
        while(l <= mid && r <= right){
            if(nums[l] < nums[r]){
                temp[i++] = nums[l++];
            }
            else{
                temp[i++] = nums[r++];
            }
        }

        while(l <= mid){
            temp[i++] = nums[l++];
        }
        while(r <= right){
            temp[i++] = nums[r++];
        }

        for(int k = left;k<=right;k++){
            nums[k] = temp[k-left];
        }

    }
    void merge(int[] nums,int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            merge(nums,left,mid);
            merge(nums,mid + 1,right);
            mergeSort(nums,left,mid,right);
            
        }
    }
    public int[] sortArray(int[] nums) {
        int left = 0, right =  nums.length - 1;
        merge(nums,left,right);
        return nums;
    }
}