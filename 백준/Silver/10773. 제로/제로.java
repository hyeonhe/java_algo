import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        int ans = stack.stream()
                        .mapToInt(Integer::intValue)
                                .sum();

        System.out.println(ans);
    }
}