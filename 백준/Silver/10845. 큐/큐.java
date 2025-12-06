import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> d = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String comm = st.nextToken();

            switch (comm) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    d.addLast(num);
                    break;
                case "pop":
                    sb.append(d.isEmpty() ? -1 : d.poll()).append("\n");
                    break;
                case "size":
                    sb.append(d.size()).append("\n");
                    break;
                case "empty":
                    sb.append(d.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(d.isEmpty() ? -1 : d.peek()).append("\n");
                    break;
                case "back":
                    sb.append(d.isEmpty() ? -1 : d.getLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}