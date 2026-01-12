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
        int max = 0;

        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (tree[i] > max) max = tree[i];
        }

        binarySearch(0, max);
        System.out.println(ans);
    }

    static void binarySearch(int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            long cnt = 0;

            for (int i = 0; i < n; i++) {
                cnt += Math.max(tree[i] - mid, 0);
            }

            if (cnt >= m) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}