import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    double max = -1;
    double sum = 0.0;

    for(int i = 0; i < n; i++) {

      double num = Double.parseDouble(st.nextToken());

      if(num > max) {
        max = num;
      }

      sum += num;
    }

    System.out.print(((sum / max) * 100.0) / n);
  }
}