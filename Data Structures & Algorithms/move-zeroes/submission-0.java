class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 1;

        while (p2 < nums.length) {

            while (p2 < nums.length && nums[p2] == 0) {
                p2++;
            }

            while (p1 < p2 && nums[p1] != 0) {
                p1++;
            }

            if (p2 < nums.length) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;

                p1++;
                p2++;
            }
        }
    }
}