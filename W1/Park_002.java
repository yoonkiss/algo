import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 002: Mem: 14348 mb, Time: 132 ms, Line: 841
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        double[] score = new double[str.length];

        double max = 0;
        for (int i = 0; i < str.length; i++) {
            score[i] = Integer.parseInt(str[i]);
            max = Math.max(max, score[i]);
        }
        double sum = 0;
        for (int i = 0; i < str.length; i++) {

            score[i] = score[i] / max * 100;
            sum += score[i];
        }

        System.out.println(sum / str.length);
    }
}
