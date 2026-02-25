import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();

            String str = br.readLine();
            if (str.equals(".")) break;

            boolean isBalanced = true;

            for (int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
                else if (c == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) isBalanced = false;
            sb.append(isBalanced ? "yes" : "no");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}