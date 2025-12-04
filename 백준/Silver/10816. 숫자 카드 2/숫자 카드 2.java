import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int MAX_NUM = 10_000_000;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[MAX_NUM * 2 + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[num + MAX_NUM]++;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(arr[num + MAX_NUM] + " ");
        }

        System.out.println(sb);
    }
}