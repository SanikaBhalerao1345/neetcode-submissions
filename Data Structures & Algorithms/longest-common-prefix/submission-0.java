class Solution {
    public String longestCommonPrefix(String[] strs) {
      String ans = "";
      int count=1;

      int min = strs[0].length();

for (int i = 1; i < strs.length; i++) {
    min = Math.min(min, strs[i].length());
}
      
      for(int j=0; j<min; j++){
        int i=1;
       while(i<strs.length){
        if(strs[i-1].charAt(j)!=strs[i].charAt(j)){
          count--;
        }
        i++;

       }
       if(count>0){
        ans+=strs[i-1].charAt(j);
       }
      }
      return ans; 
    }
}