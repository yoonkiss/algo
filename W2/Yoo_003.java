import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Yoo_003 {
    //구간 합 구하기 254192KB 2948ms
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] sumArray = new int[n+1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int input = sc.nextInt();
            sum += input;
            sumArray[i] = sum;
        }
        //1,3 -> S[3] - S[0]
        //2,4 -> S[4] - S[1]

        for (int i = 0; i < m; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();

            System.out.println(sumArray[second] - sumArray[first -1]);
        }

    }
}
