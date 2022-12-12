import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;

    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();

    for(int i = 0; i < n; i++) {
      int num = str.charAt(i) - 48;
      sum += num;
    }
    System.out.print(sum);
  }
}
