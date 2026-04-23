class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            int parent = i;
            while (true) {
                int largest = parent;
                int left = 2 * parent + 1;
                int right = 2 * parent + 2;

                if (left < n && nums[left] > nums[largest]) {
                    largest = left;
                }

                if (right < n && nums[right] > nums[largest]) {
                    largest = right;
                }

                if (largest == parent) break;

                int temp = nums[parent];
                nums[parent] = nums[largest];
                nums[largest] = temp;

                parent = largest;
            }
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move root to end
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            int parent = 0;

            // Heapify reduced heap
            while (true) {
                int largest = parent;
                int left = 2 * parent + 1;
                int right = 2 * parent + 2;

                if (left < i && nums[left] > nums[largest]) {
                    largest = left;
                }

                if (right < i && nums[right] > nums[largest]) {
                    largest = right;
                }

                if (largest == parent) break;

                temp = nums[parent];
                nums[parent] = nums[largest];
                nums[largest] = temp;

                parent = largest;
            }
        }

        return nums;
    }
}