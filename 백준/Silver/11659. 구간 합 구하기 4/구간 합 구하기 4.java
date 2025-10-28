import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] dp = new int[n + 1];
        int[] ans = new int[m];

        for (int i = 1; i < n + 1; i++) {
            if (i == 1) dp[i] = Integer.parseInt((st.nextToken()));
            else dp[i] = Integer.parseInt((st.nextToken())) + dp[i - 1];
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt((st.nextToken()));
            int b = Integer.parseInt((st.nextToken()));
            ans[i] = dp[b] - dp[a-1];
        }

        for (int x : ans) System.out.println(x);

    }
}