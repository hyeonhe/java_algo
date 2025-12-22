import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int i = 0;
        int cnt = 0;
        int len = str.length();

        while (i < len) {
            char c = str.charAt(i);

            if (c == 'c') {
                if (i < len - 1) {
                    char nextC = str.charAt(i+1);
                    if (nextC == '=' || nextC == '-') {
                        i++;
                    }
                }
            }

            else if (c == 'd') {
                if (i < len - 1) {
                    char nextC = str.charAt(i+1);
                    if (nextC == 'z') {
                        if (i < len - 2) {
                            char lastC = str.charAt(i+2);
                            if (lastC == '=') {
                                i += 2;
                            }
                        }
                    }
                    else if (nextC == '-') {
                        i++;
                    }
                }
            }

            else if (c == 'l' || c == 'n') {
                if (i < len - 1) {
                    char nextC = str.charAt(i+1);
                    if (nextC == 'j') {
                        i++;
                    }
                }

            }
            else if (c == 's' || c == 'z') {
                if (i < len - 1) {
                    char nextC = str.charAt(i+1);
                    if (nextC == '=') {
                        i++;
                    }
                }
            }
            cnt++;
            i++;
        }

        System.out.println(cnt);
    }
}