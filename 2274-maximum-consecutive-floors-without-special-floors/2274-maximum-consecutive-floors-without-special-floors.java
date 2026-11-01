class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        if(top - bottom + 1 == special.length) return 0;
        if(special.length == 0) return top - bottom + 1;

        int maxf = Integer.MIN_VALUE;

        for(int i=1; i<special.length; i++) {
            maxf = Math.max(maxf, special[i] - special[i-1] - 1);
        }

        maxf = Math.max(maxf, special[0] - bottom);
        maxf = Math.max(maxf, top - special[special.length - 1]);

        return maxf;
    }
}