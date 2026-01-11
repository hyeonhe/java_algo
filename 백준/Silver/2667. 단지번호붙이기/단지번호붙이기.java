import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int n;
    static int[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        grid = new int[n][n];
        visited = new boolean[n][n];
        ArrayList<Integer> house = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    int cnt = bfs(i, j);
                    house.add(cnt);
                }
            }
        }

        Collections.sort(house);
        
        sb.append(house.size()).append('\n');
        for (int n : house) {
            sb.append(n).append('\n');
        }

        System.out.println(sb);
    }

    static int bfs(int x, int y) {
        Queue<Point> queue = new ArrayDeque<>();
        queue.add(new Point(x, y));
        visited[0][0] = true;
        grid[x][y] = 0;
        int cnt = 1;

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && grid[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new Point(nx, ny));
                    visited[nx][ny] = true;
                    grid[nx][ny] = 0;
                    cnt++;
                }
            }
        }

        return cnt;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}