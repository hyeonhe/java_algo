import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean[] isNotSelfNum = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            sum += i;
            sum += i / 1000;
            sum += i % 1000 / 100;
            sum += i % 100 / 10;
            sum += i % 10;

            if (sum <= 10000) isNotSelfNum[sum] = true;
        }

        for (int i = 1; i <= 10000; i++) {
            if (!isNotSelfNum[i]) sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}