class Solution {
    public int findLucky(int[] arr) {
        int ans=-1;
        HashMap <Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        for(int i:hm.keySet()){
             if(i==hm.get(i)){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}