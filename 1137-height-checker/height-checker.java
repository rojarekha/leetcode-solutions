class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<heights.length;i++){
             pq.add(heights[i]);
        }
        for(int i=0;i<heights.length;i++){
            int ch=heights[i];
            if(pq.poll() != ch){
                count++;
            }
        }
        return count;
        
    }
}