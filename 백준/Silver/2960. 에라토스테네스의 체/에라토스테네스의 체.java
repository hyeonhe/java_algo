import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] isDeleted = new boolean[n+1];
        boolean[] isPrimeNum = new boolean[n+1];
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                isDeleted[i] = true;
                isPrimeNum[i] = true;
                cnt++;
                
                if (cnt == k) {
                    System.out.println(i);
                    break;
                }
                
                for (int j = i * 2; j <= n; j += i) {
                    if (!isDeleted[j]) {
                        isDeleted[j] = true;
                        cnt++;
                    }
                    if (cnt == k) {
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}