import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);

        String[] arr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (x > Integer.parseInt(arr[i])) sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}