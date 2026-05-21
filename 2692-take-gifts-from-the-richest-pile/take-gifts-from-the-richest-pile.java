class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        
        for(int i=0;i<k;i++){
            int sq=(int)Math.sqrt(pq.poll());
            pq.add(sq);
        }

        long ans=0;
        for(int i:pq){
            ans+=i;
        }
        return ans;
    }
}