class Solution {
    public int findKthPositive(int[] arr, int k) {
        Stack<Integer> st = new Stack<>();
        int index = 0;

        for (int i = 1; i <= 2000; i++) {
            if (index < arr.length && arr[index] == i) {
                index++;
            } else {
                st.push(i);
            }

            if (st.size() == k) {
                return st.peek();
            }
        }
        return -1;
    }
}