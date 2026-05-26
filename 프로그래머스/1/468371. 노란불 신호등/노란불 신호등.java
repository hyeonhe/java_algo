class Solution {
    public int solution(int[][] signals) {
        int lcm = 1;
        for (int[] s: signals) {
            int cycle = s[0] + s[1] + s[2];
            lcm = lcm / gcd(lcm, cycle) * cycle;
        }
        
        for (int t = 1; t <= lcm; t++) {
            boolean allYellow = true;
            for (int[] s: signals) {
                int cycle = s[0] + s[1] + s[2];
                int x = (t - 1) % cycle;
                if (!(s[0] <= x && x < s[0] + s[1])) {
                    allYellow = false;
                    break;
                }                
            }
            if (allYellow) return (int) t;
        }
        return -1;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}