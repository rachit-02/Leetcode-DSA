class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);
        return new int[]{first, last};
    }

    private int findPosition(int[] nums, int target, boolean isFirst) {
        int low = 0, high = nums.length - 1;
        int pos = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                pos = mid;
                if (isFirst) {
                    high = mid - 1;   // move left
                } else {
                    low = mid + 1;    // move right
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return pos;
    }
}
