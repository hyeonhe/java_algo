import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int cnt = 0;
        
        ArrayList<Integer> stack = new ArrayList<>();
        
        for (int n: ingredient) {
            
            
            stack.add(n);

            
            if (stack.size() >= 4) {
                int size = stack.size();
                
                if (stack.get(size - 4) == 1 &&
                   stack.get(size - 3) == 2 &&
                   stack.get(size - 2) == 3 &&
                   stack.get(size - 1) == 1) {
                    cnt++;
                    
                    for (int i = 0; i < 4; i++) {
                        stack.remove(stack.size() - 1);
                    }
                }
            }
        }
        
        return cnt;
    }
}