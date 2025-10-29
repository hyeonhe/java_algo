import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxVal = Integer.parseInt(br.readLine());
        int idx = 1;

        for (int i = 1; i <= 8; i++) {
            int num = Integer.parseInt(br.readLine());
            if (maxVal < num) {
                maxVal = num;
                idx = i+1;
            }
        }

        System.out.println(maxVal + "\n" + idx);

        br.close();
    }
}