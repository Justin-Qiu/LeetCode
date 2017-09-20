class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i;
        Arrays.sort(nums);
        for(i = 0; i < nums.length - 1; i++)
        {
            if((nums[i] ^ nums[i+1]) == 0) 
                return true;
        }
        return false;
    }
}