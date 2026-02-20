class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int a = sizes[i][0];
            int b = sizes[i][1];
            if (a >= b) {
                x = Math.max(x, a);
                y = Math.max(y, b);
            }
            else {
                x = Math.max(x, b);
                y = Math.max(y, a);
            }
        }
        
        return x * y;
    }
}