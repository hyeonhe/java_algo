import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int tmp = n;
        int digit = 0;

        while (n > 0) {
            n /= 10;
            digit++;
        }

        int num = 1;
        for (int i = 1; i < digit; i++) {
            num = num * 10 + 1;
        }

        if (tmp >= 0 && tmp <= 10) System.out.println(1);
        else if (tmp < num) System.out.println(digit - 1);
        else System.out.println(digit);
    }
}