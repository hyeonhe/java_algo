import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if (s.equals("(")) {
                    stack.add(s);
                }
                else if (s.equals(")")) {
                    if (stack.isEmpty()) {
                        stack.add(s);
                        break;
                    } else if (stack.pop().equals("(")){
                        continue;
                    }
                }

            }
            if (stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");

            stack.clear();
        }

        System.out.println(sb);
    }
}