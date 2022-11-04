import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Yoo_004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[n + 1][n + 1]; //보기 좋게?

        //1. 표 만들기
        for (int i = 1; i <= n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n ; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //2 구간합 구하기
        int[][] sumMatrix = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) sumMatrix[1][j] = sumMatrix[1][j] + matrix[1][j];
                if (j == 1) sumMatrix[j][j] = sumMatrix[j-1][1] + matrix[j][1];
                sumMatrix[i][j] = sumMatrix[i][j - 1] + sumMatrix[i - 1][j] + -sumMatrix[i - 1][j - 1] + matrix[i][j];
            }
        }

        //3. 정답 도출
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = sumMatrix[x2][y2] - sumMatrix[x1-1][y2] - sumMatrix[x2][y1-1] + sumMatrix[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
