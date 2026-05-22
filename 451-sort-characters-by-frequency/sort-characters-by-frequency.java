class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1); 
        }
        PriorityQueue <Freq> pq = new  PriorityQueue<>((a,b)-> b.value - a.value);
        for(char ch:hm.keySet()){
            Freq temp = new Freq(ch,hm.get(ch));
            pq.add(temp);
        }

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Freq top = pq.poll();
            char ch = top.key;
            int count=top.value;
            for(int i=0;i<count;i++){
                sb.append(ch);
            }

        }
        return sb.toString();
        
    }
}
class Freq{
    char key;
    int value;
    Freq(char key , int value){
        this.key=key;
        this.value=value;
    }
}