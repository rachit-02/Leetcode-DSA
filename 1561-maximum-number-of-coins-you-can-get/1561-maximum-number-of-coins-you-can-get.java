class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int index = piles.length - 1;
        int totalPiles = piles.length / 3;
        int maxCoins = 0;

        while (totalPiles > 0) {
            maxCoins += piles[index - 1];
            index -= 2;
            totalPiles -= 1;
        }

        return maxCoins;
    }
}