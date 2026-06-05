class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            hm.put(temp,hm.getOrDefault(temp,0)+1);
        }
        for(int ch:hm.keySet()){
           if(hm.get(ch) > 1){
                return ch;
            }
        }
        return -1;
    }
}
