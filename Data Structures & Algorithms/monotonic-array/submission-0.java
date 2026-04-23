class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean monotonicInc = false;
        if(nums[0]<= nums[1])
        {
            monotonicInc =  true;
        }
        for(int i=0; i<nums.length-1; i++)
        {
            if(monotonicInc)
            {
                if(nums[i] > nums[i+1])
                {
                    return false;
                }
            }
            else
            {
                if(nums[i] < nums[i+1])
                {
                    return false;
                }
            }
        }
        return true;
    }
}