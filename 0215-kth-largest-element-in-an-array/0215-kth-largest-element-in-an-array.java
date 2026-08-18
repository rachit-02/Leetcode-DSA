class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int[] selectArray = new int[k];

        for (int i = 0; i < k; i++) {
            selectArray[i] = nums[nums.length - k + i];
        }

        return selectArray[0];
    }
}