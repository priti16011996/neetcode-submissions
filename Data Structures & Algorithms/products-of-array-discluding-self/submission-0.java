class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefixArr[] = new int[n];
        int prefix =1;
        for(int i=0; i<n; i++)
        {
            prefixArr[i] = prefix;
            prefix *= nums[i];
        }

        int suffixArr[] = new int[n];
        int suffix=1;
        for(int i=n-1; i>=0; i--)
        {
            suffixArr[i] = suffix;
            suffix *= nums[i];
        }

        int outputArr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            outputArr[i] = prefixArr[i]*suffixArr[i];
        }

        return outputArr;
    }
}  
