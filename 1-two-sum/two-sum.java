class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){ // i = 1 -> 2
            for(int y = i+1; y < nums.length; y++){ // y = 2 -> 7
                if(nums[i] + nums[y] == target){
                    return new int[] {i,y};
                }
            }
        }
        return new int[] {};
    }
}