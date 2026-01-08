import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] set = new boolean[21];

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "add":
                    set[Integer.parseInt(st.nextToken())] = true;
                    break;
                case "check":
                    int n = Integer.parseInt(st.nextToken());
                    sb.append(set[n] ? 1 : 0).append('\n');
                    break;
                case "remove":
                    set[Integer.parseInt(st.nextToken())] = false;
                    break;
                case "toggle":
                    int toggleNum = Integer.parseInt(st.nextToken());
                    set[toggleNum] = !set[toggleNum];
                    break;
                case "all":
                    for (int k = 1; k <= 20; k++) {
                        set[k] = true;
                    }
                    break;
                case "empty":
                    set = new boolean[21];
            }
        }

        System.out.print(sb);
    }
}