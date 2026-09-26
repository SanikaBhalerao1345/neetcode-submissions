class Solution {
    public int[] getConcatenation(int[] nums) {
      int j=0;
      int[] arr = new int[(nums.length*2)];
     int i=0;
      while(j<(nums.length)*2){
        arr[j] = nums[i];
        j++;
        i++;
        if(i>=nums.length) i=0;
      }  

      return arr;
    }
}