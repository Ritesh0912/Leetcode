class Solution {
    public void moveZeroes(int[] nums) {
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) continue;
            i++;
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
           
        }
    }

}
