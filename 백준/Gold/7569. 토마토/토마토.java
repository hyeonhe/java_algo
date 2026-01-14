import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] arr;
    static boolean[][][] visited;
    static Queue<Point> queue;
    static int n;
    static int m;
    static int h;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        arr = new int[n][m][h];
        visited = new boolean[n][m][h];
        queue = new ArrayDeque<>();

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (arr[i][j][k] == 1) {
                        queue.add(new Point(i, j, k));
                        visited[i][j][k] = true;
                    }
                }
            }
        }

        bfs();
        int cnt = 0;

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    cnt = Math.max(arr[i][j][k], cnt);
                }
            }
        }

        System.out.println(cnt-1);
    }

    static void bfs() {
        while(!queue.isEmpty()) {
            Point p = queue.poll();
            int x = p.x;
            int y = p.y;
            int z = p.z;

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || nz < 0 || nz >= h) continue;
                if (!visited[nx][ny][nz] && arr[nx][ny][nz] == 0) {
                    queue.add(new Point(nx, ny, nz));
                    visited[nx][ny][nz] = true;
                    arr[nx][ny][nz] = arr[x][y][z] + 1;
                }
            }
        }
    }
}

class Point {
    int x;
    int y;
    int z;
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}