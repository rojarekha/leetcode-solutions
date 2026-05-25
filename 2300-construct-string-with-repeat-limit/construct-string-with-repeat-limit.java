class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Construct> pq = new PriorityQueue<>((a, b) -> b.key - a.key);
        for (char ch : hm.keySet()) {
            pq.add(new Construct(ch, hm.get(ch)));
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            Construct top = pq.poll();
            char ch = top.key;
            int count = top.value;
            int use = Math.min(count, repeatLimit);

            for (int i = 0; i < use; i++) {
                sb.append(ch);
            }
            count -= use;
            if (count > 0) {
                if (pq.isEmpty()) {
                    break;
                }
                Construct top2 = pq.poll();
                char ch2 = top2.key;
                int count2 = top2.value;
                sb.append(ch2);
                count2--;
                if (count2 > 0) {
                    pq.add(new Construct(ch2, count2));
                }
                pq.add(new Construct(ch, count));
            }
        }

        return sb.toString();
    }
}

class Construct {
    char key;
    int value;
    Construct(char key, int value) {
        this.key = key;
        this.value = value;
    }
}