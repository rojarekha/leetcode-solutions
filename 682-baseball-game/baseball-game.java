class Solution {
    public int calPoints(String[] operations) {
       Stack <Integer> st=new Stack<>();
       
       for(int i=0;i<operations.length;i++){
        String s=operations[i];
        if(s.equals("D")){
           int dd= st.peek();
           int ans=dd*2;
           st.push(ans);
           
        }else if(s.equals("C")){
            st.pop();
        }else if(s.equals("+")){
            int cc=st.pop();
            int cp=st.peek();
            int sol=cc+cp;
            st.push(cc);
            st.push(sol);
           
        }else{
           st.push(Integer.valueOf(s));
           
        }
         
       }
       int result=0;

       while(!st.isEmpty()){
        int pop=st.pop();
        result+=pop;
       }

       return result;
    }
}