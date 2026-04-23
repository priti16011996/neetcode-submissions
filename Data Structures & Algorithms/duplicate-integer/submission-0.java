class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> h1 = new HashSet<Integer>();
        for(int i =0; i<nums.length; i++)
        {
            if(h1.contains(nums[i]))
            {
                return true;
            }
            h1.add(nums[i]);
        }
        return false;
    }
}