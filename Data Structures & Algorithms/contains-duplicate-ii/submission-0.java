class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        for(int i=0; i< nums.length; i++)
        {
            if(!hs.add(nums[i]))
            {
                return true;
            }
            if(hs.size()>k)
            {
                hs.remove(nums[i-k]);
            }
        }
        return false;
    }
}