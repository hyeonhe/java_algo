import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] word = new String[n];

        for (int i = 0; i < n; i++) {
            word[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            String str = word[i];
            StringBuilder reverse = new StringBuilder();
            for (int j = str.length() - 1; j >= 0 ; j--) {
                reverse.append(str.charAt(j));
            }

            if (str.equals(String.valueOf(reverse))) System.out.printf("%d %c", str.length(), str.charAt(str.length() / 2));
            for (int j = i + 1; j < n; j++) {
                if (word[j].equals(String.valueOf(reverse))) System.out.printf("%d %c", str.length(), str.charAt(str.length() / 2));
            }
        }
    }
}