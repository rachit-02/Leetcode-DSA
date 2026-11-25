class Solution {
    public void sortColors(int[] nums) {
        int r = 0, w = 0, b = 0;

        int n = nums.length;

        for(int e : nums){
            if(e == 0) r++;
            else if(e == 1) w++;
            else b++;
        }
        int i = 0;
        while(r --> 0){
            nums[i++] = 0;
        }

        
        while(w --> 0){
            nums[i++] = 1;
        }

        while(b --> 0){
            nums[i++] = 2;
        }
    }
}