class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length)*2];
        int j=0;
        int i=0;
        while(i<(nums.length)*2){
            ans[i]=nums[j];
            j++;
            i++;
            if(j==nums.length) j=0;
        }

        return ans;
    }
}