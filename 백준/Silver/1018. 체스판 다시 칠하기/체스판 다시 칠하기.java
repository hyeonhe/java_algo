import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[n][m];

        int min = 64;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') arr[i][j] = true;
                else arr[i][j] = false;
            }
        }
        
        for (int a = 0; a <= n - 8; a++) {
            for (int b = 0; b <= m - 8; b++) {
                boolean firstB = arr[a][b];
                int cnt = 0;

                for (int i = a; i < a + 8; i++) {
                    for (int j = b; j < b + 8; j++) {
                        if ((i + j) % 2 == 0 && firstB != arr[i][j]) cnt++;
                        else if ((i + j) % 2 != 0 && firstB == arr[i][j]) cnt++;
                    }
                }

                cnt = Math.min(cnt, 64 - cnt);
                min = Math.min(min, cnt);
            }
        }

        System.out.println(min);
    }
}