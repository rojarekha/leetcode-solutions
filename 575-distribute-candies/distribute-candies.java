class Solution {
    public int distributeCandies(int[] candyType) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<candyType.length;i++){
        int ch=candyType[i];
        hm.put(ch,hm.getOrDefault(ch,0)+1);
       }
       int eat=candyType.length/2;
       if(hm.size()==1){
        return 1;
       }else{
        return Math.min(hm.size(), eat);
       }
    }
}