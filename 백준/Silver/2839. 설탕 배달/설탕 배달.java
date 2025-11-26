import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        
        while(n >= 0) {
            if (n % 5 == 0) {
                ans += n / 5;
                break;
            }

            if (n >= 3) {
                n -= 3;
                ans++;
            }
            else {
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}