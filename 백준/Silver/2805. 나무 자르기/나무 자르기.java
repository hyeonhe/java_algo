import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] tree;
    static int n, m;
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        tree = new int[n];

        int min = 0;
        int max = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (tree[i] > max) max = tree[i];
        }

        while (min <= max) {
            int mid = (min + max) / 2;
            long cnt = 0;

            for (int i = 0; i < n; i++) {
                cnt += Math.max(tree[i] - mid, 0);
            }

            if (cnt >= m) {
                ans = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(ans);
    }
}