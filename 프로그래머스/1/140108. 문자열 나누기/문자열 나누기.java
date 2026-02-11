class Solution {
    public int solution(String s) {
        int answer = 0;
        int xCnt = 0;
        char x = ' ';
        
        for (int i = 0; i < s.length(); i++) {
            if (x == ' ') {
                xCnt++;
                x = s.charAt(i);
            }
                           
            else if (x == s.charAt(i)) xCnt++;
            else xCnt--;
            
            if (xCnt == 0) {
                answer++;
                x = ' ';
            }
        }
        
        if (xCnt > 0) answer++;
        
        return answer;
    }
}