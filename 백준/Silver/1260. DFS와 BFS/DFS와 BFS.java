import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];
        boolean[] visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(arr, visited, n, v);
        sb.append('\n');
        visited = new boolean[n+1];
        bfs(arr, visited, n, v);
        System.out.println(sb);
    }

    static void dfs(int[][] arr, boolean[] visited, int n, int v) {
        visited[v] = true;
        sb.append(v).append(' ');

        for (int i = 1; i <= n; i++) {
            if (arr[v][i] == 1 && !visited[i]) {
                dfs(arr, visited, n, i);
            }
        }
    }

    static void bfs(int[][] arr, boolean[] visited, int n, int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            int num = queue.poll();
            sb.append(num).append(' ');

            for (int i = 1; i <= n; i++) {
                if (arr[num][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
