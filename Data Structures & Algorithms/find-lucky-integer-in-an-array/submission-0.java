class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501]; // Constraint: 1 <= arr[i] <= 500
        
        // Count frequencies
        for (int num : arr) {
            if (num <= 500) {
                freq[num]++;
            }
        }
        
        int result = -1;
        
        // Check for lucky numbers
        for (int i = 1; i <= 500; i++) {
            if (freq[i] == i) {
                result = i; // Keep updating to get the largest
            }
        }
        
        return result;
    }
}