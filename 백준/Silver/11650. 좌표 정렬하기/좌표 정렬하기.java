import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int arrLength = Integer.parseInt(br.readLine());

        StringTokenizer st;

        // 2차원 배열 생성
        int[][] arr = new int[arrLength][2];

        for (int i = 0; i < arrLength; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];  // 내림차순은 b[1] - a[1] 로 지정해야 한다.
            } else {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < arrLength; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}