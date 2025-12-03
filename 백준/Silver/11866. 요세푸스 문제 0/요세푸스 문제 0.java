import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n =  Integer.parseInt(st.nextToken());
        int k =  Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        sb.append("<");

        int idx = 0;
        while (list.size() > 1) {
            idx = (idx + (k - 1)) % list.size();

            sb.append(list.remove(idx)).append(", ");
        }

        sb.append(list.remove()).append(">");
        System.out.println(sb);
    }
}