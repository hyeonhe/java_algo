import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, String> pokemon1 = new HashMap<>();
        HashMap<String, Integer> pokemon2 = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            pokemon1.put(i,  name);
            pokemon2.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            char s = str.charAt(0);
            if (s - '0' > 9) sb.append(pokemon2.get(str)).append('\n');
            else sb.append(pokemon1.get(Integer.parseInt(str))).append('\n');
        }

        System.out.println(sb);
    }
}