import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] dp = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            if (i == 1) dp[i] = Integer.parseInt((st.nextToken()));
            else dp[i] = Integer.parseInt((st.nextToken())) + dp[i - 1];
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt((st.nextToken()));
            int b = Integer.parseInt((st.nextToken()));
            ans.append(dp[b] - dp[a-1]).append("\n");
        }

        System.out.println(ans);
    }
}