class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int index = -1;

        for(int i = 0; i < word.length(); i++) {
            char chw = word.charAt(i);

            st.push(chw);

            if(chw == ch) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            return word;
        }

        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

        for(int i = index + 1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }
}