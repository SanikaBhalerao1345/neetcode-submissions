class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
       for(int i=0; i<nums.length; i++){
        if(j<nums.length && nums[i]!=val){
            nums[j]=nums[i];
            j++;
        }
       }
       return j; 
    }
}