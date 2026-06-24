class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> hm=new HashMap<>();
        HashMap <Character,Integer> hmm=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<magazine.length();j++){
           char ch= magazine.charAt(j);
            hmm.put(ch,hmm.getOrDefault(ch,0)+1);
        }
        for (char key : hm.keySet()) {
            if (!hmm.containsKey(key)) {
                return false;
            }

            int required = hm.get(key);
            int available = hmm.get(key);

            if (required > available) {
                return false;
            }
        }

        return true;
    }
}