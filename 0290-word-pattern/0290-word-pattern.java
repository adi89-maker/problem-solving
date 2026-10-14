class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> ch_map=new HashMap<>();
        Map<String,Character> w_map=new HashMap<>();
        String words[]=s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        for(int i=0;i<words.length;i++){
            char ch=pattern.charAt(i);
            String word=words[i];
            if(!ch_map.containsKey(ch)){
                if(w_map.containsKey(word)){
                    return false;
                }
                else{
                    ch_map.put(ch,word);
                    w_map.put(word,ch);
                }
            }
            else{
                String mapped =ch_map.get(ch);
                if(!mapped.equals(word)){
                    return false;
                }
            }
        }
        return true;
     
    }
}