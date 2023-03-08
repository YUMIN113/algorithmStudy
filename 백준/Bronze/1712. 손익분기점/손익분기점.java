import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int fixedCost = Integer.parseInt(st.nextToken());
        int variableCost = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        if (price <= variableCost) {
            System.out.println("-1");
        } else {
            System.out.println((fixedCost / (price - variableCost)) + 1);
        }
    }
}