class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> sts = new Stack<>();
        Stack <Character> stt = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='#'){
                if(!sts.isEmpty()){
                    sts.pop();
                }
            }else{
                sts.push(ch);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch =t.charAt(i);
            if(ch=='#'){
                if(!stt.isEmpty()){
                    stt.pop();
                }
            }else{
                stt.push(ch);
            }
        }
        return sts.equals(stt);
        
    }
}