class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int freq : hm.values()) {
            if (set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }

        return true;
    }
}