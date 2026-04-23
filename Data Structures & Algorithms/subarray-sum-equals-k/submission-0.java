class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        
        // Base case: prefix sum 0 has occurred once
        prefixCount.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if there is a prefix sum that when removed gives k
            count += prefixCount.getOrDefault(prefixSum - k, 0);

            // Store current prefix sum
            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}