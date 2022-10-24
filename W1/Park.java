import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Mem: 14332 mb, Time: 128 ms, Line: 487
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        String line = br.readLine();
        for(int i = 0; i < line.length(); i++) {
            sum += (line.charAt(i) - '0');
        }

        System.out.println(sum);
    }
}
