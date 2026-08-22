class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> st = new ArrayDeque<>();

        for (int x : asteroids) {

            boolean alive = true;

            while (alive && x < 0 && !st.isEmpty() && st.peek() > 0) {

                int a = st.peek();

                if (a < -x) {
                    st.pop();
                }
                else if (a == -x) {
                    st.pop();
                    alive = false;
                }
                else {
                    alive = false;
                }
            }

            if (alive) {
                st.push(x);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}