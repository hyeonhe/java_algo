import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if (str.equals("END")) break;

            String reversedWord = new StringBuilder(str).reverse().toString();
            sb.append(reversedWord).append("\n");
        }

        System.out.println(sb);
    }
}