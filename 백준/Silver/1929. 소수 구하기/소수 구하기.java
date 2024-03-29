import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int fromNum = Integer.parseInt(st.nextToken());
        int toNum = Integer.parseInt(st.nextToken());

        for (int i = fromNum; i <= toNum; i++) {

            boolean isPrime = true;

            if (i == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                sb.append(i);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}