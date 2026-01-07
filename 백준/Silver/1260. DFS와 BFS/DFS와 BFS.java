import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n + 1];
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

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        visited = new boolean[n+1];
        dfs(v);
        sb.append('\n');
        visited = new boolean[n+1];
        bfs(n, v);
        System.out.println(sb);
    }

    static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(' ');

        for (int next: arr[v]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int n, int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            int num = queue.poll();
            sb.append(num).append(' ');

            for (int next: arr[num]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}