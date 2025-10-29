import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<Integer> stack = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    stack.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.remove(stack.size() - 1)).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.get((stack.size() - 1))).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}