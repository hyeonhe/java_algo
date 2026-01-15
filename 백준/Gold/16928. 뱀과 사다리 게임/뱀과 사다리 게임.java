import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[101];
    static int[] board = new int[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n+m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            board[a] = b;
        }

        bfs();
        System.out.println(arr[100]);
    }

    static void bfs() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);

        while(!queue.isEmpty()) {
            int x = queue.poll();

            if (x == 100) break;
            for (int i = 1; i < 7; i++) {
                int n = x + i;

                if (n > 100) continue;
                if (board[n] != 0) {
                    n = board[n];
                }
                if (arr[n] == 0) {
                    arr[n] = arr[x] + 1;
                    queue.offer(n);
                }
            }
        }
    }
}