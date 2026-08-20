class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        Deque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                st.push(x);
            }
            else if (!st.isEmpty() &&
                    ((x == ')' && st.peek() == '(') ||
                     (x == '}' && st.peek() == '{') ||
                     (x == ']' && st.peek() == '['))) {
                st.pop();
            }
            else {
                return false;
            }
        }

        return st.isEmpty();
    }
}