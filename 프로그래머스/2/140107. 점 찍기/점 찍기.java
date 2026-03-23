class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        long limit_double = (long)Math.pow(d, 2);
        for (int i = 0; i <= d; i += k) {
            long i_double = (long)Math.pow(i, 2);
            long sqrt = (long)Math.sqrt(limit_double - i_double);
            answer += sqrt / k + 1; 
        }
        
        return answer;
    }
}