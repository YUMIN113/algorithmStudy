import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int sum = 0;

    st = new StringTokenizer(br.readLine(), " ");

    for(int i = 0; i < 5; i++) {
      int num = Integer.parseInt(st.nextToken());
      sum += num * num;
    }
    int result = sum % 10;
    System.out.print(result);
  }
}