import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int result = (length - night) / (day - night);
        
        if((length - night) % (day - night) != 0) {
            result++;
        }

        System.out.println(result);
        
    }
}