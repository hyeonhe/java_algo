import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // 1. 빈도 계산 (소문자 'a'부터 'z'까지 26개)
            int[] frequencies = new int[26];
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char currentChar = str.charAt(j);
                // 공백 또는 소문자가 아닌 다른 문자를 건너뛰는 로직
                // 만약 대문자도 처리하려면: char lowerChar = Character.toLowerCase(currentChar);
                if (currentChar >= 'a' && currentChar <= 'z') {
                    frequencies[currentChar - 'a']++;
                }
                // 기존 코드처럼 공백만 건너뛰려면:
                // if (currentChar == ' ') continue;
                // frequencies[currentChar - 'a']++;
            }

            // 2. 최대 빈도 찾기
            int maxFrequency = -1;
            int maxCharIndex = -1;
            boolean isTie = false;

            for (int j = 0; j < frequencies.length; j++) {
                if (frequencies[j] > maxFrequency) {
                    maxFrequency = frequencies[j];
                    maxCharIndex = j;
                    isTie = false; // 새로운 최대 빈도를 찾았으니 동점 아님
                } else if (frequencies[j] == maxFrequency && maxFrequency > 0) {
                    // 현재 빈도가 최대 빈도와 같고, 빈도가 0보다 크다면 동점 발생
                    isTie = true;
                }
            }

            // 3. 결과 출력
            if (isTie) {
                sb.append("?").append("\n");
            } else {
                // maxCharIndex는 'a'로부터의 거리이므로 다시 문자로 변환
                sb.append(Character.toString(maxCharIndex + 'a')).append("\n");
            }
        }

        System.out.println(sb);
    }
}