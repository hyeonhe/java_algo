import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            String str = br.readLine();        
            boolean flag = true;

            for (int j = 0; j < str.length(); j++) {
                char s = str.charAt(j);

                if (s == '(') {
                    stack.add(s);
                }
                else if (s == ')') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }

            }
            
            if (flag && stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
            stack.clear();
        }

        System.out.println(sb);
    }
}