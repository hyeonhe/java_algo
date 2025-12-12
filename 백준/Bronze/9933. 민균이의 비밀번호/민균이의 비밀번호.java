import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> wordSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            wordSet.add(br.readLine());
        }

        for (String word: wordSet) {

            String reversedWord = new StringBuilder(word).reverse().toString();

            if (wordSet.contains(reversedWord)) {
                System.out.printf("%d %c", word.length(), word.charAt(word.length() / 2));
                return;
            }


        }
    }
}