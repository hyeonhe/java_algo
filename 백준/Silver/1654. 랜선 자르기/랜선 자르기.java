import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] arr = new long[k];
        long start = 1;
        long end = 0;
        long answer = 0;

        for (int i = 0; i < k; i++) {
            long num = Long.parseLong(br.readLine());
            arr[i] = num;
            end = Math.max(end, num);
        }

        while(start <= end) {
            long mid = start + (end - start) / 2;
            long line = 0;

            for (int i = 0; i < k; i++) {
                line += arr[i] / mid;
            }

            if (line >= n) {
                answer = mid;
                start = mid + 1;
            } else end = mid - 1;
        }

        System.out.println(answer);
    }
}