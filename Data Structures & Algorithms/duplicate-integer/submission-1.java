
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        for(int i=0; i<nums.length; i++){
            
            if(j<nums.length && j<nums.length && nums[i]==nums[j]){
                return true;
            }
            j++;
        }
        return false;
    }
}