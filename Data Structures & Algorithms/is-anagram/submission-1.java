class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character, Integer> maps = new HashMap<>();
      for(int i=0; i<s.length(); i++){
        maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i),0)+1);

      }
      HashMap<Character, Integer> mapt = new HashMap<>();
      for(int j=0; j<t.length(); j++){
        mapt.put(t.charAt(j), mapt.getOrDefault(t.charAt(j),0)+1);
      }

      return maps.equals(mapt);
    }
}
