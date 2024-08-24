class SolutionTwo {
    public void rotate(int[] nums, int k) {
        if(nums == null || k < 0) {
            throw new IllegalArgumentException("Illegal argument");
        }

        for(int i=0; i < k; i++) {

            for(int j = nums.length -1; j>0; j--) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
    }
}

/*
 * Space is O(1) and time is O(n*k)
 */