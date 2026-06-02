class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int tem=0;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(temp==1){
                ans=ans+1;
            }else{
                tem=Math.max(ans,tem);
                ans=0;
            }
            
        }
        return Math.max(ans,tem);
    }
}