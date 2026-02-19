class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int num = 1;
        int i = 0;
        int j = 0;
        char arrow = 'd';
            
        while (true) {
            if (arrow == 'd' && i < n && i >= 0 && j < n && j >= 0 && arr[i][j] == 0) {            
                arr[i][j] = num++;
                if (i+1 >= 0 && i+1 < n && arr[i+1][j] == 0) i++;
                else {
                    arrow = 'r';
                    j++;
                }
            }
            if (arrow == 'r' && i < n && i >= 0 && j < n && j >= 0 &&  arr[i][j] == 0) {            
                arr[i][j] = num++;
                if (j+1 >= 0 && j+1 < n && arr[i][j+1] == 0) j++;
                else {
                    arrow = 'u';
                    i--;
                    j--;
                }
            }
            if (arrow == 'u' && i < n && i >= 0 && j < n && j >= 0 && arr[i][j] == 0) {            
                arr[i][j] = num++;
                if (i-1 >= 0 && i-1 < n && j-1 >= 0 && j-1 < n && arr[i-1][j-1] == 0) {
                    i--;
                    j--;
                }
                else {
                    arrow = 'd';
                    i++;
                }
            }
            
            if (num > (n * (n+1)) / 2) break;
        }
        
        int idx = 0;
        int[] answer = new int[n * (n+1) / 2];
        
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (arr[x][y] != 0) answer[idx++] = arr[x][y];
            }
        }
        
        return answer;
    }
}