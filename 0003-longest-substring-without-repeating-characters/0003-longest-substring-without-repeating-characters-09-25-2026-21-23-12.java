class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int low=0;
        Set<Character> set=new HashSet<>();
        for(int high=0;high<s.length();high++){
            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(s.charAt(high));
            len=Math.max(len,high-low+1);

        }
        return len;


    }
}