import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        visited = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) bfs(i);
        }

        System.out.println(cnt);
    }

    static void bfs(int num) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(num);
        visited[num] = true;

        while (!queue.isEmpty()) {
            int k = queue.poll();

            for (int i : arr[k]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        cnt++;
    }
}