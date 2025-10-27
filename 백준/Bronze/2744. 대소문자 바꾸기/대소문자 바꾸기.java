import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        br.close();

        String upperStr = str.toUpperCase();
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (upperStr.charAt(i) != str.charAt(i)) {
                bw.write(upperStr.charAt(i));
            }
            if (lowerStr.charAt(i) != str.charAt(i)) {
                bw.write(lowerStr.charAt(i));
            }
        }

        bw.flush();
        bw.close();
    }
}