import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    int reverse1 = 0;
    int reverse2 = 0;

    st = new StringTokenizer(br.readLine(), " ");

    String num1 = st.nextToken();
    String num2 = st.nextToken();

    for(int i = 2; i >= 0; i--) {
      reverse1 = Integer.parseInt(sb1.append(num1.charAt(i)).toString());
      reverse2 = Integer.parseInt(sb2.append(num2.charAt(i)).toString());
    }

    System.out.print(Math.max(reverse1, reverse2));

  }
}