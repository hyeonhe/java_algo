class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;
        int n = park.length;
        int m = park[0].length();
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }
        
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        char[] direction = {'E', 'W', 'S', 'N'};
        
        for (String route: routes) {
        
            char r = route.charAt(0);
            int cnt = route.charAt(2) - '0';            
            
            boolean isBlocked = false;
            int nx = x, ny = y;
            
            for (int i = 0; i < 4; i++) {
                
                if (direction[i] == r) {
                    for (int step = 1; step <= cnt; step++) {
                        int tx = x + dx[i] * step;
                        int ty = y + dy[i] * step;
                        
                        if (tx < 0 || tx >= n || ty < 0 || ty >= m || park[tx].charAt(ty) == 'X') {
                        isBlocked = true;
                        break;
                    }
                        nx = tx;
                        ny = ty;
                    }
                    
                }
            }
            
            if (!isBlocked) {
                x = nx;
                y = ny;
            }
    
        }
        
        return new int[]{x, y};
    }
}