import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;

            LinkedList<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
               q.add(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            while (!q.isEmpty()) {
                int[] firstNum = q.poll();
                boolean isMax = true;


                    for (int[] doc : q) {
                        if (doc[1] > firstNum[1]) {
                            isMax = false;
                            break;
                        }
                    }

                    if (isMax) {
                        cnt++;
                        if (firstNum[0] == m) {
                            sb.append(cnt).append("\n");
                            break;
                        }
                    } else {
                        q.add(firstNum);
                    }


            }
        }

        System.out.println(sb);
    }
}