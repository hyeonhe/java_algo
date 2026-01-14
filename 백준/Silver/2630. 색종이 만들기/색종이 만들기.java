import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        splitPaper(0, 0, n);

        sb.append(white).append('\n').append(blue);
        System.out.println(sb);
    }

    static void splitPaper (int startX, int startY, int size) {
        int firstNum = arr[startX][startY];

        for (int i = startX; i < startX + size; i++) {
            for (int j = startY; j < startY + size; j++) {
                if (firstNum != arr[i][j]) {
                    int reSize = size / 2;
                    splitPaper(startX, startY, reSize);
                    splitPaper(startX + reSize, startY, reSize);
                    splitPaper(startX, startY + reSize, reSize);
                    splitPaper(startX + reSize, startY + reSize, reSize);
                    return;
                }
            }
        }

        if (firstNum == 0) white++;
        else blue++;
    }
}