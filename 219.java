class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i, j;
        int flag = 0;
        if(k == 0)
            return false;
        else if(k < nums.length)
        {
            int[] array = new int[nums.length];
            System.arraycopy(nums, 0, array, 0, nums.length);
            Arrays.sort(array);
            for(i = 0; i < array.length - 1; i++)
            {
                if((array[i] ^ array[i + 1]) == 0) 
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            {
                for(i = 0; i < nums.length; i++)
                {
                    for(j = i + 1; j < i + Math.min(k + 1, nums.length - i); j++)
                    {
                        if(nums[i] == nums[j]) 
                            return true;
                    }
                }
                return false;
            }
            else
                return false;
        }
        else
        {
            Arrays.sort(nums);
            for(i = 0; i < nums.length - 1; i++)
            {
                if((nums[i] ^ nums[i + 1]) == 0) 
                    return true;
            }
            return false;
        }
    }
}
