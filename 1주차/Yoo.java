import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Yoo {
    public static void main(String[] args) throws IOException {
//        solution001();
        solution002();
    }

    private static void solution001() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String m = br.readLine();

        char[] numbers = m.toCharArray();
        int sum = 0;
        for (char number : numbers) {
            sum += number - '0';
        }
        System.out.println(sum);
    }

    private static void solution002() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;

        for (int i : m) {
            if (i > max) max = i;
            sum += i;
        }

        System.out.println(sum * 100.0 / max / n);
    }
}