import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name = br.readLine();

        HashSet<Character> str = new HashSet<>();
        str.add('q');
        str.add('w');
        str.add('e');
        str.add('r');
        str.add('t');
        str.add('a');
        str.add('s');
        str.add('d');
        str.add('f');
        str.add('g');
        str.add('z');
        str.add('x');
        str.add('c');
        str.add('v');

        System.out.println(str.contains(name.charAt(n - 1)) ? 1 : 0);
    }
}