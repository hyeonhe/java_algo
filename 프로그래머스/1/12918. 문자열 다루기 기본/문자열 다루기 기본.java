class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';            

            if ((s.length() != 4 && s.length() != 6) || n > 9 || n < 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
};