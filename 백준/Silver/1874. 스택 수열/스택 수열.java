import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        int k = 1;
        boolean isValid = true;
        for (int num : arr) {
            while (k <= num) {
                stack.add(k++);
                sb.append("+\n");
            }
            
            if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            }
            else {
                isValid = false;
                System.out.println("NO");
                break;
            }
        }

        if (isValid) {
            System.out.println(sb);
        }
    }
}