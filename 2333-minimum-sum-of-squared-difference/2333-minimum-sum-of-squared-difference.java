
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        long[] freq = new long[100001];
        long max = 0;

        for (int i = 0; i < nums1.length; i++) {
            long diff = Math.abs(nums1[i] - nums2[i]);
            freq[(int) diff]++;
            max = Math.max(max, diff);
        }

        while (k > 0 && max > 0) {
            long count = freq[(int) max];

            if (count <= k) {
                freq[(int) max] = 0;
                freq[(int) (max - 1)] += count;
                k -= count;
                max--;
            } else {
                freq[(int) max] -= k;
                freq[(int) (max - 1)] += k;
                break;
            }
        }

        long result = 0;

        for (int i = 0; i <= 100000; i++) {
            result += freq[i] * i * i;
        }

        return result;
    }
}
