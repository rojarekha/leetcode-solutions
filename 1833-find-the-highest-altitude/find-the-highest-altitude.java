class Solution {
    public int largestAltitude(int[] gain) {
      
      int ans=0;
      int result=0;
      for(int i=0;i<gain.length;i++){
        
        ans+=gain[i];
        
        result=Math.max(ans,result);

      }  
      return result;
    }
}