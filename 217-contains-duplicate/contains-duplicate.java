class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(int twice:nums){
            if(hm.get(twice)>1){
                return true;
            }
        }
        return false;
    }
}