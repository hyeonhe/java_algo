import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n * 2 - 1; i++) {
            if (i < n) sb.append(" ".repeat(i - 1)).append("*".repeat((n - i + 1) * 2 - 1)).append("\n");
            else sb.append(" ".repeat(n * 2 - i - 1)).append("*".repeat((i - n) * 2 + 1)).append("\n");
        }

        System.out.println(sb);
    }
}