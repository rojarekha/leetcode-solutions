class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> list = new ArrayList<>();
        
        ArrayList<Integer> list1=new ArrayList<>();

        int max = 0;
        for(int i=0;i<candies.length;i++){
            int temp = candies[i] + extraCandies;
            list1.add(temp);
            int var = Math.abs(temp - extraCandies);
            if(var > max){
                max = var;
            }
        }
        for(int num : list1){
            if(num >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;

    }
}