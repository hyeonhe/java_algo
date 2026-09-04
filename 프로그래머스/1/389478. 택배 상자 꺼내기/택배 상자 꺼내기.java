class Solution {
    public int solution(int n, int w, int num) {
        int numRow = (num - 1) / w;
        int maxRow = (n - 1) / w;
        
        int answer = maxRow - numRow + 1;
        
        int numCol = getCol(num, w);
        int maxCol = getCol(n, w);
        
        if (maxRow % 2 == 0) {
            if (numCol > maxCol) answer--;
        } else {
            if (numCol < maxCol) answer--;
        }
        
        return answer;
    }
    
    private int getCol(int number, int w) {
        int row = (number - 1) / w;
        int rem = (number - 1) % w;
        return (row % 2 == 0) ? rem : (w - 1 - rem);
    }
}