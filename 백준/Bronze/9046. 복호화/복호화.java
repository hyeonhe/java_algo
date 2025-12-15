//import java.io.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int[] alpha = new int[26];
            int maxNum = 0;
            int idx = 0;
            boolean flag = false;

            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ') continue;
                alpha[str.charAt(j) - 'a']++;
            }

            for (int j = 0; j < alpha.length; j++) {
                if (maxNum < alpha[j]) {
                    maxNum = alpha[j];
                    idx = j;
                    flag = false;
                }
                else if (maxNum == alpha[j]) flag = true;
            }

            sb.append(flag ? "?" : Character.toString(idx + 'a')).append("\n");
        }

        System.out.println(sb);
    }
}