class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] position = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            char route = routes[i].charAt(0);
            int cnt = Integer.parseInt("" + routes[i].charAt(2));            
            boolean isBlocked = false;
            
            if (route == 'E') {
                for (int k = 1; k <= cnt; k++) {
                    if (position[1] + k >= park[0].length()) {
                        isBlocked = true;
                        break;
                    }
                    if (park[position[0]].charAt(position[1] + k) == 'X') {
                        isBlocked = true;
                        break;
                    }
                }
                if (!isBlocked) position[1] += cnt;
            }
            else if (route == 'W') { 
                for (int k = 1; k <= cnt; k++) {
                    if (position[1] - k < 0) {
                        isBlocked = true;
                        break;
                    }
                    if (park[position[0]].charAt(position[1] - k) == 'X') {
                        isBlocked = true;
                        break;
                    }
                }
                if (!isBlocked) position[1] -= cnt;
            }
            else if (route == 'S') {
                for (int k = 1; k <= cnt; k++) {
                    if (position[0] + k >= park.length) {
                        isBlocked = true;
                        break;
                    }
                    if (park[position[0] + k].charAt(position[1]) == 'X') {
                        isBlocked = true;
                        break;
                    }
                }
                if (!isBlocked) position[0] += cnt;
            }
            else if (route == 'N') {
                for (int k = 1; k <= cnt; k++) {
                    if (position[0] - k < 0) {
                        isBlocked = true;
                        break;
                    }
                    if (park[position[0] - k].charAt(position[1]) == 'X') {
                        isBlocked = true;
                        break;
                    }
                }
                if (!isBlocked) position[0] -= cnt;
            }
        }
        
        return position;
    }
}