class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         // Map to store next greater element for each number in nums2
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Traverse nums2
        for (int num : nums2) {
            // If current number is greater than stack top,
            // then it is the next greater element
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        // Remaining elements in stack have no next greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        // Build result array for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}