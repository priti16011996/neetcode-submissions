class Solution {
    public int search(int[] nums, int target) {
        
        return SearchInRotateArray(nums,target,0,nums.length-1);
    }
    public int SearchInRotateArray(int[] nums, int target, int start, int end)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = start+(end-start)/2;
        if(nums[mid]== target)
        {
            return mid;
        }
        if(nums[mid] >= nums[start])
        {
            if(target<= nums[mid] && target >= nums[start])
            {
               return SearchInRotateArray(nums,target,start,mid-1);
            }
            else
            {
                return SearchInRotateArray(nums,target,mid+1,end);
            }
        }
        else
        {
            if(target>=nums[mid+1] && target <= nums[end] )
            {
                return SearchInRotateArray(nums,target,mid+1,end);
            }
            else
            {
                return SearchInRotateArray(nums,target,start,mid-1);
            }
        }
    }
}
