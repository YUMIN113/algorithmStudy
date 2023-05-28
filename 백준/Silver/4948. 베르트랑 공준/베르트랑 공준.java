import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                break;
            }
            int count = 0;
            for (int i = num + 1; i <= (num * 2); i++) {

                boolean isPrime = true;

                if (i == 2) {
                    count ++;
                    break;
                }
                int sqrt = (int) Math.sqrt(i);
                for (int j = 2; j <= sqrt; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
            sb.append(count);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}