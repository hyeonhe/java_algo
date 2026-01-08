import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> numSet = new HashSet<>();

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("add")) {
                numSet.add(Integer.parseInt(st.nextToken()));
            }
            else if (command.equals("check")) {
                int n = Integer.parseInt(st.nextToken());
                sb.append(numSet.contains(n) ? 1 : 0).append('\n');
            }
            else if (command.equals("remove")) {
                int n = Integer.parseInt(st.nextToken());
                numSet.remove(n);
            }
            else if (command.equals("toggle")) {
                int n = Integer.parseInt(st.nextToken());
                if(numSet.contains(n)) numSet.remove(n);
                else numSet.add(n);
            }
            else if (command.equals("all")) {
                for (int k = 1; k <= 20; k++) {
                    numSet.add(k);
                }
            }
            else if (command.equals("empty")) {
                numSet = new HashSet<>();
            }
        }

        System.out.println(sb);
    }
}