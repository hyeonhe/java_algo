import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];

        dp[2] = dp[3] = 1;
        for(int i = 4; i <= 1000000; i++) {
            int num = Integer.MAX_VALUE;
            if (i % 3 == 0) num = dp[i / 3] + 1;
            if (i % 2 == 0) num = Math.min(num, dp[i / 2] + 1);
            num = Math.min(num, dp[i - 1] + 1);

            dp[i] = num;
        }

        System.out.println(dp[x]);
    }
}